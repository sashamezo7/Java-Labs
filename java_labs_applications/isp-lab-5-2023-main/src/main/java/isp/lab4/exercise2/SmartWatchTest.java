package isp.lab4.exercise2;

import static org.junit.Assert.*;

public class SmartWatchTest {
    SmartWatch smartWatch= new SmartWatch(10);
    @org.junit.Test
    public void CorrectResults(){
        int expected = (int)(10+30*0.5);
        smartWatch.charge(30);
        int actual = smartWatch.getBatteryLevel();
        assertEquals(expected,actual);
    }

}