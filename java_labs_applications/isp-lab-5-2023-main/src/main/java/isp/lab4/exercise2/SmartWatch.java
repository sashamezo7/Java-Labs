package isp.lab4.exercise2;

public class SmartWatch implements Chargeable{
    private int batteryLevel;

    public SmartWatch(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public SmartWatch() {
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public void charge(int durationInMinutes) {
        if(batteryLevel+durationInMinutes*0.5<=100)
            this.batteryLevel+=durationInMinutes*0.5;
        else batteryLevel=100;
    }
}
