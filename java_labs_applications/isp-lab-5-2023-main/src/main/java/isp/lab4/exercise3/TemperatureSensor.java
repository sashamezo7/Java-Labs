package isp.lab4.exercise3;


public class TemperatureSensor extends MonitoringService.Sensor {
    private double temperature;

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public TemperatureSensor() {
    }
}
