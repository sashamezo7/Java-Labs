package aut.isp.lab4.exercise4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AquariumControllerTest {

    FishFeeder f = new FishFeeder("Catalin SRL", "jmecher");
    AquariumController acvariu = new AquariumController("Sasha","ss",f);
    @Test
    void setCurrentTime() {

    }

    @Test
    void getLightOnTime() {

    }

    @Test
    void getLightsOffTime() {
    }
}