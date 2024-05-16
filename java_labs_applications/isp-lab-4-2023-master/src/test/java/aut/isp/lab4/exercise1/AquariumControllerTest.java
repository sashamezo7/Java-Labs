package aut.isp.lab4.exercise1;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class AquariumControllerTest {

    @Test
    public void toStringTest(){

        AquariumController acvariu = new AquariumController("Aqua","Xlarge");
        acvariu.setCurrentTime(3.3F);
        String actual=acvariu.toString();
        String expected ="Manufacturer: Aqua Model: Xlarge Current Time: 3.3";
        assertEquals(expected,actual,"nu sunt egale");

    }

}
