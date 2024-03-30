package Assignment5.Decorator.UnitTest;

import Assignment5.Decorator.Burger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class BurgerTest {
    private Burger burger;

    @BeforeEach
    void setUp() {
        burger = new Burger();
    }

    @Test
    void getDescription() {
        assertEquals("Burger", burger.getDescription());  // Check if the description matches
    }

    @Test
    void getCost() {
        assertEquals(2.50, burger.getCost(), 0.01);  // Assuming base price of Vegan Burger is $2.50
    }
}