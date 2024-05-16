package aut.isp.lab4.exercise5;

public class Exercise5 {
    public static void main(String[] args) {
        FishFeeder food = new FishFeeder("Catalin","RR");
        AquariumController acvariu = new AquariumController("Sasha","ff",food);
        LevelSensor levelSensor = new LevelSensor();
        TemperatureSensor temp = new TemperatureSensor();
        acvariu.checkWaterLevel();
        acvariu.checkTemperature();

    }
}
