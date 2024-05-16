package isp.lab4.exercise2;

public class Laptop implements Chargeable{
    private int batteryLevel;

    public Laptop(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void charge(int durationInMinutes) {
        if(batteryLevel+durationInMinutes*2<=100)
             this.batteryLevel+=durationInMinutes*2;
        else batteryLevel=100;
    }
    @Override
    public int getBatteryLevel() {
        return batteryLevel;
    }

}
