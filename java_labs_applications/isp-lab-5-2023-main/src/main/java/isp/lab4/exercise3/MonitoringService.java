package isp.lab4.exercise3;

public class MonitoringService {

    private Sensor []sensors = new Sensor[10];
    
    public double getAvarageTemperatureSensor(TemperatureSensor[]temperatureSensors){
        double averageTemperature;
        double sum=0;
        int nr=0;
        for(int i=0;i<temperatureSensors.length;i++){
            if(temperatureSensors[i].getTemperature()!=0) {
                sum += temperatureSensors[i].getTemperature();
                nr++;
            }
        }
        averageTemperature = (double)sum/nr;
        return averageTemperature;
    }
    public double getAverageAllSensors(TemperatureSensor[] temperatureSensors,PressureSensor[] pressureSensors){
        double averageAllSensors;
        double sum=0;
        int nr=0;
        for(int i=0;i<temperatureSensors.length;i++){
            if(temperatureSensors[i].getTemperature()!=0) {
                sum += temperatureSensors[i].getTemperature();
                nr++;
            }
        }
        for(int i=0;i<pressureSensors.length;i++){
            if(pressureSensors[i].getPressure()!=0) {
                sum += pressureSensors[i].getPressure();
                nr++;
            }
        }
        averageAllSensors = (double)sum/nr;
        return averageAllSensors;

    }
    public MonitoringService(Sensor []sensors){this.sensors=sensors;}

    public MonitoringService() {
    }

    static abstract class Sensor {
        private String installLocation;
        private String name;

       public Sensor() {
       }
   }
}
