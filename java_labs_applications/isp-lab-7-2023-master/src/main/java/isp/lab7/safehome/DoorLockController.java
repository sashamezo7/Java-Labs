package isp.lab7.safehome;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class DoorLockController implements ControllerInterface{
    private Map<Tenant,AccessKey> validAccess = new HashMap<>();
    private List<AccessLog> list=new ArrayList<>();
    private int introducerePin=0;
    private Door door=new Door();

    public DoorStatus enterPin(String pin) throws InvalidPinException, TooManyAttemptsException {
        for(Map.Entry<Tenant,AccessKey>enery:validAccess.entrySet())
            System.out.println("Introduceti codul pin: ");
        Scanner scanner = new Scanner(System.in);
        AccessKey accesKey = new AccessKey(pin);
        if (validAccess.containsValue(accesKey)) {
            DoorStatus open = DoorStatus.OPEN;
        }
        if (!validAccess.containsValue(accesKey)) {
            introducerePin++;
            if(introducerePin==3){
                throw new TooManyAttemptsException("Prea multe introduceri");
            }
            throw new InvalidPinException("Pinul este gresit");

        }
        if(door.getStatus()==DoorStatus.OPEN){
            return DoorStatus.CLOSE;
        }

        return DoorStatus.OPEN;

    }

    public void addTenant(String pin,String tenantName){

    }
    public void removeTenant(String name){

    }


}
