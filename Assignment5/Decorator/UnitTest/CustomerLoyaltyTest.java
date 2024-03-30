package Assignment5.Decorator.UnitTest;

import Assignment5.Decorator.CustomerLoyalty;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CustomerLoyaltyTest {
    private CustomerLoyalty customerLoyalty;

    @BeforeEach
    void setUp() {
        // Initialize a CustomerLoyalty instance with the loyalty level "VIP"
        customerLoyalty = new CustomerLoyalty("VIP");
    }

    @Test
    void testApplyDiscountVIP() {
        double totalCost = 100.0;
        double discountedCost = customerLoyalty.applyDiscount(totalCost);
        assertEquals(90.0, discountedCost, 0.01); // Expected discounted cost for VIP loyalty level
    }

    @Test
    void testApplyDiscountRegular() {
        // Change the loyalty level to "REGULAR"
        customerLoyalty = new CustomerLoyalty("REGULAR");

        double totalCost = 100.0;
        double discountedCost = customerLoyalty.applyDiscount(totalCost);
        assertEquals(100.0, discountedCost, 0.01); // Expected total cost (no discount) for REGULAR loyalty level
    }
}