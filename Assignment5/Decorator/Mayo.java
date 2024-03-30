package Assignment5.Decorator;

public class Mayo extends ToppingDecorator {
    public static final double COST = 0.30;
    public Mayo(MenuItem newMenuItem) {
        super(newMenuItem);
    }

    public String getDescription() {
        return menuItem.getDescription() + ", Mayo";
    }

    public double getCost() {
        return menuItem.getCost() + COST;
    }
}
