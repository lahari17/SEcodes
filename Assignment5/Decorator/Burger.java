package Assignment5.Decorator;

public class Burger implements MenuItem{

    public final static double COST = 2.50;

    public String getDescription() {
        return "Burger";
    }

    public double getCost() {
        return COST;
    }
}
