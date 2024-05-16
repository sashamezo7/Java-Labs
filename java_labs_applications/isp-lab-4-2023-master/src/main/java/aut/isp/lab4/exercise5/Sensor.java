package aut.isp.lab4.exercise5;

abstract class Sensor {
    private String manufacturer;
    private String model;
    @Override
    public String toString(){
        return manufacturer +" "+ model;
    }
}
