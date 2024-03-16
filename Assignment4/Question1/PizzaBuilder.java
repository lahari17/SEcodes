package Assignment4.Question1;
import java.util.List;

public interface PizzaBuilder {
    void setSize(String size);
    void setPizzaChain(String pizzaChain);
    void setToppings(int numberOfToppings, List<String> toppings);
    Pizza getPizza();
}