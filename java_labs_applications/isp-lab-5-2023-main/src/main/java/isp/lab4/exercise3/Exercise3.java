package isp.lab4.exercise3;

public class Exercise3 {
    public static void main(String []args){

        TemperatureSensor []temperatureSensor = new TemperatureSensor[3];
        temperatureSensor[0] = new TemperatureSensor();
        temperatureSensor[1] = new TemperatureSensor();
        temperatureSensor[2] = new TemperatureSensor();

        temperatureSensor[0].setTemperature(10);
        temperatureSensor[1].setTemperature(2);
        temperatureSensor[2].setTemperature(4);

        PressureSensor []pressureSensors = new PressureSensor[2];
        pressureSensors[0] = new PressureSensor();
        pressureSensors[1] = new PressureSensor();


        pressureSensors[0].setPressure(4.5);
        pressureSensors[1].setPressure(2.7);

        MonitoringService monitor = new MonitoringService();
        System.out.println(monitor.getAvarageTemperatureSensor(temperatureSensor));
        System.out.println(monitor.getAverageAllSensors(temperatureSensor,pressureSensors));
    }
}
