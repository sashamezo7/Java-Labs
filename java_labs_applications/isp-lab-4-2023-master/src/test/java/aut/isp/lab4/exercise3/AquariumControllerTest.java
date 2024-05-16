package aut.isp.lab4.exercise3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AquariumControllerTest {

    FishFeeder fishFood = new FishFeeder("Catalin SRL","jmecher112");
    AquariumController acvariu = new AquariumController("Sasha SRL","T309",fishFood);
    @Test
    void setFeedingTime() {
        acvariu.setFeedingTime(21.30f);
    }
    @Test
    void setCurrentTime() {
        acvariu.setFeedingTime(22.30f);
        acvariu.setCurrentTime(22.30f);
    }


}