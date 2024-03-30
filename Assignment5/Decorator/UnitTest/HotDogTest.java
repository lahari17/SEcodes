package Assignment5.Decorator.UnitTest;

import Assignment5.Decorator.HotDog;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HotDogTest {
    private HotDog hotDog;

    @BeforeEach
    void setUp() {
        hotDog = new HotDog();
    }

    @Test
    void getDescription() {
        assertEquals("HotDog", hotDog.getDescription()); // Check if the description matches
    }

    @Test
    void getCost() {
        assertEquals(3.60, hotDog.getCost(), 0.01); // Assuming the base price of HotDog is $3.60
    }
}