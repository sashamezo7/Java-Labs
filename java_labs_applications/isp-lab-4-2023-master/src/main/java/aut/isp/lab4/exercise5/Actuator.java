package aut.isp.lab4.exercise5;

abstract class Actuator {
    private String manufacturer;
    private String model;

    public void turnOn(){
    }
    public void turnOff(){
    }
    @Override
    public  String toString(){
        return manufacturer+" "+model;
    }
}


