package isp.lab8.airways;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Route {
    @Getter
    String name;
    public List<Waypoint> waypoints;

    public Route(String name) {
        this.name = name;
        this.waypoints = new ArrayList<>();
    }

    public void addWaypoint(Waypoint waypoint){
        waypoints.add(waypoint);
    }
    public void removeWaypoint(Waypoint waypoint){
        waypoints.remove(waypoint);
    }

    public double calculateDistanceRoute(){
        double distanceRoute=0;
        for(int i=0;i<waypoints.size()-1;i++){
            distanceRoute = distanceRoute+WaypointDistanceCalculator.calculateDistance(waypoints.get(i).getLatitude(),waypoints.get(i).getLongitude(),waypoints.get(i+1).getLatitude(),waypoints.get(i+1).getLongitude());
        }
        return distanceRoute;
    }

}
