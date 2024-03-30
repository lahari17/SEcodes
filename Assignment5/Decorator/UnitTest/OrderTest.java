package Assignment5.Decorator.UnitTest;

import Assignment5.Decorator.FriesToppings;
import Assignment5.Decorator.MenuItem;
import Assignment5.Decorator.Order;
import Assignment5.Decorator.Burger;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {
    private Order order;

    @BeforeEach
    void setUp() {
        // Create an order with a regular customer loyalty status
        order = new Order("12345");
    }

    @Test
    void addItem() {
        MenuItem burger = new Burger();
        MenuItem fries = new FriesToppings(); // Using the Fries class
        order.addItem(burger);
        order.addItem(fries);
        assertEquals(2, order.getOrder().size(), "Items should be added to the order");
        assertEquals(burger, order.getOrder().get(0), "First item should match");
        assertEquals(fries, order.getOrder().get(1), "Second item should match");
    }

    @Test
    void showCost() {
        // Create real menu items
        MenuItem item1 = new Burger();
        MenuItem item2 = new FriesToppings();

        // Add menu items to the order
        order.addItem(item1);
        order.addItem(item2);

        // Redirect standard output to capture the output generated by the showCost method
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Invoke showCost method
        order.showCost();

        // Restore the original standard output
        System.setOut(originalOut);

        // Get the captured output
        String capturedOutput = outputStream.toString();

        // Calculate the expected total cost
        double expectedCost = item1.getCost() + item2.getCost();

        // Assert that the captured output contains the expected total cost
        assertTrue(capturedOutput.contains(String.format("Total Cost before discount: $%.2f%n", expectedCost)),
                "Output should contain the expected total cost");
    }

    @Test
    void orderDescription() {
        MenuItem burger = new Burger();
        MenuItem fries = new FriesToppings(); // Using the Fries class
        order.addItem(burger);
        order.addItem(fries);
        String expectedDescription = String.format("\nOrder Number %s: Burger, Fries, ", order.orderNumber);
        assertEquals(expectedDescription, order.orderDescription(), "Order description should match");
    }

    @Test
    void receipt() {
        // Create real menu items
        MenuItem item1 = new Burger();
        MenuItem item2 = new FriesToppings();

        // Add menu items to the order
        order.addItem(item1);
        order.addItem(item2);

        // Redirect standard output to capture the output generated by the receipt method
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));

        // Invoke receipt method
        order.receipt();

        // Restore the original standard output
        System.setOut(originalOut);

        // Get the captured output
        String capturedOutput = outputStream.toString();

        // Construct the expected output
        String expectedOutput = String.format("\nOrder Number %s: %s, %s, " ,
                order.orderNumber, item1.getDescription(), item2.getDescription());

        // Assert that the captured output also contains the output from showCost
        assertTrue(capturedOutput.contains(expectedOutput), "Receipt output should contain cost details");
    }

}