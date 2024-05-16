package aut.isp.lab4.exercise2;

import aut.isp.lab4.exercise1.AquariumController;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FishFeederTest {

    FishFeeder f = new FishFeeder("Catalin SLR","jmecher");

    @Test
    void fillUp() {
        f.fillUp();
    }
    @Test
    void feed() {
        f.feed();
    }

    @Test
    void testToString() {
        f.fillUp();
        f.feed();
        String actual = f.toString();
        String expected = "Catalin SLR jmecher 13";
        assertEquals(actual,expected);
    }
}