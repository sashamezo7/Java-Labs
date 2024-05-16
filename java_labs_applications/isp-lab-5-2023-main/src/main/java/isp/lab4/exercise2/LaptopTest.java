package isp.lab4.exercise2;

import static org.junit.Assert.*;

public class LaptopTest {
    Laptop laptop = new Laptop(10);
    @org.junit.Test
    public void CorrectResults(){
        int expected = 10+30*2;
        laptop.charge(30);
        int actual = laptop.getBatteryLevel();
        assertEquals(expected,actual);
    }

}