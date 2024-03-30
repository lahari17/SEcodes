package Assignment5.Decorator;

public class CheeseToppings extends ToppingDecorator {
    public static final double COST = 0.5;
    public CheeseToppings(MenuItem newMenuItem) {
        super(newMenuItem);
    }

    public String getDescription() {
        return menuItem.getDescription() + ", Cheese";
    }

    public double getCost() {
        return menuItem.getCost() + COST;
    }
}
