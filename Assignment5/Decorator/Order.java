package Assignment5.Decorator;

import java.util.ArrayList;
import java.util.List;

public class Order {
    ArrayList<MenuItem> order = new ArrayList<MenuItem>();
    public String orderNumber;
    public CustomerLoyalty customerLoyalty;

    public Order(String orderNumber, String customerLoyalty) {
        this.orderNumber = orderNumber;
        this.customerLoyalty = new CustomerLoyalty(customerLoyalty);
    }

    public Order(String orderNumber) {
        this(orderNumber, "Regular");
    }

    public void addItem(MenuItem item) {
        order.add(item);
    }

    public void showCost() {
        double cost = 0;
        for (MenuItem item : order) {
            cost += item.getCost();
        }
        System.out.printf("Total Cost before discount: $%.2f%n", cost);
        double costApplyDiscount = customerLoyalty.applyDiscount(cost);
        System.out.printf("Total Cost after discount: $%.2f%n", costApplyDiscount);
    }

    public String orderDescription() {
        String description = String.format("\nOrder Number %s: ", orderNumber);
        for (MenuItem item : order) {
            description += item.getDescription() + ", ";
        }
        return description;
    }

    public void receipt(){
        System.out.println(orderDescription());
        showCost();
    }

    public List<MenuItem> getOrder() {
        return order;
    }

}
