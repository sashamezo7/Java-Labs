package isp.lab6.exercise2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistrationSystem {
    ArrayList<Vehicle> vehicle;
    public VehicleRegistrationSystem(){
        vehicle = new ArrayList<>();
    }
    public void addVehicle(Vehicle v){
        boolean ok = true;
        for(int i=0;i<vehicle.size();i++)
        if(v.VIN.hashCode()==vehicle.get(i).VIN.hashCode()) {
            System.out.println("Vehicle already registred with VIN: " + v.getVIN());
            ok=false;
        }
        if(ok==true)
        vehicle.add(v);
    }
    public void removeVehicle(Vehicle v){
        vehicle.remove(v);
    }
    public void dysplayVehicles(){
        for(int i=0;i<vehicle.size();i++){
            System.out.println(vehicle.get(i).toString());
        }
    }

}
