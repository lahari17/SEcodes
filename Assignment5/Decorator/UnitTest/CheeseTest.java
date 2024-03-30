package Assignment5.Decorator.UnitTest;

import Assignment5.Decorator.CheeseToppings;
import Assignment5.Decorator.MenuItem;
import Assignment5.Decorator.Burger;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class CheeseTest {
    private MenuItem menuItem;
    private CheeseToppings cheese;

    @BeforeEach
    void setUp() {
        menuItem = new Burger(); // For testing, let's assume we're adding cheese to a vegan burger
        cheese = new CheeseToppings(menuItem);
    }

    @Test
    void getDescription() {

        assertEquals("Burger, Cheese", cheese.getDescription()); // Expected description after adding cheese
    }

    @Test
    void getCost() {
        assertEquals(3.0, cheese.getCost(), 0.01); // Assuming VeganBurger base cost is $2.50, adding cheese should make it $3.0
    }
}