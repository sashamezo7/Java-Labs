package isp.lab10.exercise1;

import java.util.ArrayList;
import java.util.List;

public class AtcCommand {
    private List<Aircraft> aircrafts;

    public AtcCommand() {
        aircrafts = new ArrayList<>();
    }

    public void addAircraft(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    public void takeoff(String aircraftId, int cruisingAltitude) {
        Aircraft aircraft = findAircraft(aircraftId);
        if (aircraft != null) {
            aircraft.takeoff(cruisingAltitude);
        } else {
            System.out.println("Aircraft " + aircraftId + " not found.");
        }
    }

    public void land(String aircraftId) {
        Aircraft aircraft = findAircraft(aircraftId);
        if (aircraft != null) {
            aircraft.land();
        } else {
            System.out.println("Aircraft " + aircraftId + " not found.");
        }
    }

    private Aircraft findAircraft(String aircraftId) {
        for (Aircraft aircraft : aircrafts) {
            if (aircraft.getAircraftId().equals(aircraftId)) {
                return aircraft;
            }
        }
        return null;
    }
}


