package Assignment5.Decorator.UnitTest;

import Assignment5.Decorator.FriesToppings;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FriesTest {
    private FriesToppings fries;

    @BeforeEach
    void setUp() {
        fries = new FriesToppings();
    }

    @Test
    void getDescription() {
        assertEquals("Fries", fries.getDescription()); // Check if the description matches
    }

    @Test
    void getCost() {
        assertEquals(1.9, fries.getCost(), 0.01); // Assuming the base price of Fries is $1.90
    }
}