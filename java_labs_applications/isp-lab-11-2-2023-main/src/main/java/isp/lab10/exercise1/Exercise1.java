package isp.lab10.exercise1;

public class Exercise1 {

    public static void main(String[] args) {
        AtcCommand atcSystem = new AtcCommand();

        Aircraft aircraft1 = new Aircraft("ABC123");
        Aircraft aircraft2 = new Aircraft("XYZ789");

        atcSystem.addAircraft(aircraft1);
        atcSystem.addAircraft(aircraft2);

        aircraft1.start();
        aircraft2.start();

        try {
            Thread.sleep(2000);  // Wait for aircraft to be in "On Stand" state
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        atcSystem.takeoff("ABC123", 3000);
        atcSystem.takeoff("XYZ789", 5000);

        try {
            Thread.sleep(12000);  // Wait for aircraft to ascend
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        atcSystem.land("ABC123");
        atcSystem.land("XYZ789");

        try {
            aircraft1.join();
            aircraft2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Aircraft 1 cruising time: " + aircraft1.getCruisingTime() + " seconds.");
        System.out.println("Aircraft 2 cruising time: " + aircraft2.getCruisingTime() + " seconds.");
    }
}



