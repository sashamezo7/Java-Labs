package aut.isp.lab4.exercise3;

public class AquariumController {

    private String manufacturer;
    private String model;
    private float currentTime;
    private float feedingTime;
    private FishFeeder fooodFish;

    public AquariumController(String manufacturer,String model,FishFeeder fooodFish){
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

}
