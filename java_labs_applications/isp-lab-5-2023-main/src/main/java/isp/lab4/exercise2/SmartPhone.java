package isp.lab4.exercise2;

public class SmartPhone implements Chargeable{
    private int batteryLevel;

    public SmartPhone(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public SmartPhone() {
    }

    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

    @Override
    public void charge(int durationInMinutes) {
        if(batteryLevel+durationInMinutes*0.7<=100)
            this.batteryLevel+=durationInMinutes*0.7;
        else batteryLevel=100;
    }
}
