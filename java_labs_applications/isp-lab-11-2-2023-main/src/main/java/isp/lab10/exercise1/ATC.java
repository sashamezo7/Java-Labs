package isp.lab10.exercise1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ATC {
    public List<Aircraft> aircrafts = new ArrayList<>();
    public void addAircraft(Aircraft aircraft){
        System.out.println("aircraft number "+ aircraft.getId()+ " is On Stand and waits for commands...");
        aircraft.setState("on stand");
        aircrafts.add(aircraft);
    }
    public void showAircrafts(){
        for(int i=0;i<aircrafts.size();i++){
            System.out.println(aircrafts.get(i).toString());
        }
    }

}
