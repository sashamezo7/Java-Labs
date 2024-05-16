package isp.lab6.exercise2;

public class Exercise2 {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("112", "CJ24AXT","Mercedes","SL 500",1960);
        Vehicle v2 = new Vehicle("112", "CJ24AXF","Mercedes","SL 500",1960);
        VehicleRegistrationSystem system = new VehicleRegistrationSystem();
        system.addVehicle(v1);
        system.addVehicle(v2);
        system.dysplayVehicles();
    }
}
