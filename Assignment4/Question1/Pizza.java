package Assignment4.Question1;
import java.util.ArrayList;
import java.util.List;
public class Pizza {
    String pizzaChain;
    String size;
    List<String> toppings;

    public Pizza(String pizzaChain) {
        this.pizzaChain = pizzaChain;
        toppings = new ArrayList<>();
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void addTopping(String topping) {
        toppings.add(topping);
    }

    public void eat() {
        System.out.println(pizzaChain);
        System.out.println("Size: " + size);
        System.out.println("Toppings:");
        for (String topping : toppings) {
            System.out.println("- " + topping);
        }
        System.out.println("Enjoy your pizza!\n");
    }
}
