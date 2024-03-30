package Assignment5.Decorator;

public abstract class ToppingDecorator implements MenuItem{
    protected MenuItem menuItem;

    public ToppingDecorator(MenuItem newMenuItem) {
        menuItem = newMenuItem;
    }

    public String getDescription() {
        return menuItem.getDescription();
    }

    public double getCost() {
        return menuItem.getCost();
    }
}
