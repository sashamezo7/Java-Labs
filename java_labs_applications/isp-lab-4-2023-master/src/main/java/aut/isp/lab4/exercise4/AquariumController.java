package aut.isp.lab4.exercise4;

public class AquariumController {

    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;
    private FishFeeder fooodFish;
    private int lightOnTime=0;
    private int lightsOffTime=0;


    public AquariumController(String manufacturer,String model,FishFeeder fooodFish){
        this.manufacturer=manufacturer;
        this.model=model;
        this.fooodFish=fooodFish;
    }
    public void setCurrentTime(float currentTime) {
        this.currentTime=currentTime;
        if(this.currentTime==this.feedingTime)
            fooodFish.feed();
        if(this.lightOnTime<8) {
            this.lightOnTime++;
        }
        else {
            this.lightsOffTime++;
        }
        if(this.lightsOffTime+this.lightOnTime==24)
        {
            this.lightsOffTime=0;
            this.lightOnTime=0;
        }
    }

    public int getLightOnTime() {
        return this.lightOnTime;
    }

    public int getLightsOffTime() {
        return this.lightsOffTime;
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

}
