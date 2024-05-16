package isp.lab8.airways;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RouteManagementApplication {
    private static List<Route> routes = new ArrayList<>();
    public static void dysplayRoutes() {
        System.out.println("Available Routes:");
        for (Route route : routes) {
            System.out.println(route.getName());
        }
    }

    public static void saveRoute(Route route) throws IOException {
        String folderPath = "/Users/sasamezo/Documents/ISP/30121_mezo_ioanalexandru_isp.labs/isp-lab-8-2023-main";
        String folderName = route.name;

        File folder = new File(folderPath, folderName);

        boolean created = folder.mkdirs();
        if (created) {
            System.out.println("Folderul a fost creat cu succes sau actualizat.");
        } else {
            System.out.println("Nu s-a putut crea sau actualiza folderul.");
        }
        for(int i=0;i<route.waypoints.size();i++) {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.writeValue(new FileWriter(folderPath +"/"+ folderName + "/" + route.waypoints.get(i).getIndex()+ " waypoint.json"), route.waypoints.get(i));
        }
        routes.add(route);
    }

    public static void deleteRoute(Route route){
        String folderPath = "/Users/sasamezo/Documents/ISP/30121_mezo_ioanalexandru_isp.labs/isp-lab-8-2023-main";
        String folderName = route.name;
        File file = new File(folderPath+"/"+folderName);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("Fișierul a fost șters cu succes.");
            } else {
                System.out.println("Nu s-a putut șterge fișierul.");
            }
        } else {
            System.out.println("Fișierul nu există.");
        }
        /*file.delete();
        System.out.println("Fisierula fost sters");*/
        routes.remove(route);

    }


    public static void main(String[] args) throws IOException {
        Route route1 = new Route("LRCL-LROP");

        Waypoint w1 = new Waypoint(1,"LRCL", 46.7852, 23.6862, 415);
        Waypoint w2 = new Waypoint(2,"TASOD",47.0548, 23.9212, 10460);
        Waypoint w3 = new Waypoint(3,"SOPAV",46.9804, 24.7365, 10900);
        Waypoint w4 = new Waypoint(4,"BIRGU",45.9467, 26.0217,10200);
        Waypoint w5 = new Waypoint(5,"LROP",44.5711, 26.0858, 106);

        route1.addWaypoint(w1);
        route1.addWaypoint(w2);
        route1.addWaypoint(w3);
        route1.addWaypoint(w4);
        route1.addWaypoint(w5);

        //saveRoute(route1);
        deleteRoute(route1);
        System.out.println(route1.calculateDistanceRoute());

    }
}
