package aut.isp.lab4.exercise5;

public class FishFeeder {
    private String manufacturer;
    private String model;
    private int meals;

    public FishFeeder(String manufacturer, String model) {
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public void feed(){
        this.meals--;
        System.out.print("Am dat de mancare la pesti...");
    }
    public void fillUp(){
        this.meals=14;
        System.out.println("Fish feeder-ul este umplut");
    }
    @Override
    public String toString(){
        return manufacturer+" "+ model +" "+ meals;
    }

}
