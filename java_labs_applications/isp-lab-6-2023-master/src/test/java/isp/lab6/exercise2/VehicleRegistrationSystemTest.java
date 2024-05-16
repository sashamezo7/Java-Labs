package isp.lab6.exercise2;

import org.junit.Test;

import static org.junit.Assert.*;

public class VehicleRegistrationSystemTest {
    Vehicle v1 = new Vehicle("112", "CJ24AXT","Mercedes","SL 500",1960);
    VehicleRegistrationSystem system = new VehicleRegistrationSystem();

    @Test
    public void addVehicle() {
        Vehicle v2 = new Vehicle("112", "CJ24AXT","Mercedes","SL 500",1960);
        system.addVehicle(v1);
        assertEquals(v1,system.vehicle.get(0));
        system.addVehicle(v2);
        assertEquals(1,system.vehicle.size());
    }

    @Test
    public void removeVehicle() {
        system.addVehicle(v1);
        system.removeVehicle(v1);
        assertEquals(0,system.vehicle.size());
    }

}