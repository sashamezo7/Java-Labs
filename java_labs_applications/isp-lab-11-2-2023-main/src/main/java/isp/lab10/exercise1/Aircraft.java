package isp.lab10.exercise1;

import lombok.*;

//@NoArgsConstructor(access = AccessLevel.PUBLIC)
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@ToString
public class Aircraft extends Thread{
    @Getter @Setter
    private String aircraftId;
    @Getter @Setter
    private String state;
    @Getter @Setter
    private int altitude;
    @Getter @Setter
    private int cruisingAltitude;
    @Getter @Setter
    private int cruisingTime;
    @Getter @Setter
    private Object lock;
    @Getter @Setter
    private boolean commandReceived;

    public Aircraft(String aircraftID){
        this.aircraftId = aircraftID;
    }

    @Override
    public void run() {
        while (true) {
            if (state.equals("On Stand")) {
                waitForCommand();
            }

            if (state.equals("Taxing")) {
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                state = "Taking off";
            }

            if (state.equals("Taking off")) {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                state = "Ascending";
            }

            if (state.equals("Ascending")) {
                ascendToCruisingAltitude();
            }

            if (state.equals("Cruising")) {
                cruisingTime++;
            }

            if (state.equals("Descending")) {
                descendToGround();
            }

            if (state.equals("Landed")) {
                break;
            }
        }
    }

    private void waitForCommand() {
        System.out.println("Aircraft " + aircraftId + ": Waiting for command.");
        synchronized (this) {
            while (!commandReceived) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            commandReceived = false;
        }
    }

    private void ascendToCruisingAltitude() {
        while (altitude < cruisingAltitude) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock) {
                altitude += 1000;
            }
            System.out.println("Aircraft " + aircraftId + ": Ascending to " + altitude + " meters.");
        }
        state = "Cruising";
    }

    private void descendToGround() {
        while (altitude > 0) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock) {
                altitude -= 1000;
            }
            System.out.println("Aircraft " + aircraftId + ": Descending to " + altitude + " meters.");
        }
        state = "Landed";
    }

    public void takeoff(int cruisingAltitude) {
        state = "Taxing";
        this.cruisingAltitude = cruisingAltitude;
        synchronized (this) {
            commandReceived = true;
            notify();
        }
    }

    public void land() {
        if (state.equals("Cruising")) {
            state = "Descending";
            synchronized (this) {
                commandReceived = true;
                notify();
            }
        } else {
            System.out.println("Aircraft " + aircraftId + ": Cannot land. Aircraft is not at cruising altitude.");
        }
    }

}
