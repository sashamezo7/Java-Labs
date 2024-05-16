package isp.lab4.exercise3;

import org.junit.Test;

import static org.junit.Assert.*;

public class MonitoringServiceTest {
    TemperatureSensor []temperatureSensor = new TemperatureSensor[3];
    PressureSensor []pressureSensors = new PressureSensor[2];
    MonitoringService monitoringService = new MonitoringService();
    @Test
    public void getAvarageTemperatureSensor() {
        temperatureSensor[0] = new TemperatureSensor();
        temperatureSensor[1] = new TemperatureSensor();
        temperatureSensor[2] = new TemperatureSensor();

        temperatureSensor[0].setTemperature(20);
        temperatureSensor[1].setTemperature(30);

        double expected = 25;
        double actual = monitoringService.getAvarageTemperatureSensor(temperatureSensor);
        double delta = 0.001;
        assertEquals(expected,actual,delta);
    }

    @Test
    public void getAverageAllSensors() {
        temperatureSensor[0] = new TemperatureSensor();
        temperatureSensor[1] = new TemperatureSensor();
        temperatureSensor[2] = new TemperatureSensor();
        pressureSensors[0] = new PressureSensor();
        pressureSensors[1] = new PressureSensor();


        temperatureSensor[0].setTemperature(20.5);
        temperatureSensor[1].setTemperature(30.8);
        pressureSensors[0].setPressure(5);
        pressureSensors[1].setPressure(3.3);

        double expected = 14.9 ;
        double actual = monitoringService.getAverageAllSensors(temperatureSensor,pressureSensors);
        double delta = 0.001;
        assertEquals(expected,actual,delta);
    }
}