package isp.lab4.exercise2;

import static org.junit.Assert.*;

public class SmartPhoneTest {
    SmartPhone smartPhone = new SmartPhone(10);
    @org.junit.Test
    public void CorrectResults(){
        int  expected = (int) (10+30*0.7);
        smartPhone.charge(30);
        int actual = smartPhone.getBatteryLevel();
        assertEquals(expected,actual);
    }

}