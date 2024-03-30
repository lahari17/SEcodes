package Assignment5.Decorator.UnitTest;

import Assignment5.Decorator.Mayo;
import Assignment5.Decorator.MenuItem;
import Assignment5.Decorator.Burger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MayoTest {
    private MenuItem menuItem;

    @BeforeEach
    void setUp() {
        menuItem = new Burger(); // For testing, let's assume we're adding mayo to a burger
    }

    @Test
    void getDescription() {
        Mayo mayo = new Mayo(menuItem);
        assertEquals("Burger, Mayo", mayo.getDescription()); // Expected description after adding mayo
    }

    @Test
    void getCost() {
        Mayo mayo = new Mayo(menuItem);
        assertEquals(2.80, mayo.getCost(), 0.01); // Assuming Burger base cost is $5.0, adding mayo should make it $5.30
    }
}