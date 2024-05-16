package aut.isp.lab4.exercise5;


import java.util.Scanner;

public class AquariumController {

    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;
    private int temperature=25;
    private FishFeeder fooodFish;
    private Sensor senzor;
    private Actuator actuator;
    private float water=12;


    public AquariumController(String manufacturer, String model, FishFeeder fooodFish){
        this.manufacturer=manufacturer;
        this.model=model;
        this.fooodFish=fooodFish;
    }
    public void setCurrentTime(float currentTime) {
        this.currentTime=currentTime;
        if(this.currentTime==this.feedingTime)
            fooodFish.feed();

    }


    @Override
    public String toString(){
        return "Manufacturer: "+this.manufacturer+
                " Model: "+this.model+
                " Current Time: "+this.currentTime;
    }
    public void setFeedingTime(float feedingTime){
        this.feedingTime=feedingTime;
    }

    public void checkTemperature(){
        TemperatureSensor tem = new TemperatureSensor();
        Heater heater = new Heater();
        tem.setValue(23);
        if(this.temperature>tem.getValue())
            heater.turnOn();
        if(this.temperature==tem.getValue())
            heater.turnOff();
    }
    public void checkWaterLevel(){

        LevelSensor level = new LevelSensor();
        level.setValue(13F);
        Alarm alarm = new Alarm();
        if(water< level.getValue())
            alarm.turnOn();


    }


}
