package isp.lab4.exercise3;

public class PressureSensor extends MonitoringService.Sensor {
    private double pressure;

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }
}
