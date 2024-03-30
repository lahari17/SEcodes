package Assignment5.Decorator;

public class FriesToppings implements MenuItem{

    public final static double COST = 1.9;

    public String getDescription() {
        return "Fries";
    }

    public double getCost() {
        return COST;
    }
}
