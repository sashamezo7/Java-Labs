package aut.isp.lab4.exercise1;

public class AquariumController {

    private String manufacturer;
    private String model;
    private float currentTime;

    public AquariumController(String m,String mo){
        this.manufacturer=m;
        this.model=mo;
    }
    public void setCurrentTime(float current_time) {currentTime=current_time;}

    @Override
    public String toString(){
        return "Manufacturer: "+this.manufacturer+
                " Model: "+this.model+
                " Current Time: "+this.currentTime;
    }
}
