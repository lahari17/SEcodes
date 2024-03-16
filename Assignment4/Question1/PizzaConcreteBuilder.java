package Assignment4.Question1;

import java.util.Arrays;
import java.util.List;

class PizzaConcreteBuilder implements PizzaBuilder {
    private Pizza pizza;
    private List<String> allToppings;

    public PizzaConcreteBuilder() {
        pizza = new Pizza("Pizza Chain");
        // Declare all toppings here
        allToppings = Arrays.asList(
                "Pepperoni", "Sausage", "Mushrooms", "Bacon", "Onions", "Extra Cheese",
                "Peppers", "Chicken", "Olives", "Spinach", "Tomato and Basil", "Beef",
                "Ham", "Pesto", "Spicy Pork", "Ham and Pineapple"
        );
    }

    public void setPizzaChain(String pizzaChain) {
        pizza = new Pizza(pizzaChain);
    }

    public void setSize(String size) {
        pizza.setSize(size);
    }

    public void setToppings(int numberOfToppings, List<String> selectedToppings) {
        for (String topping : selectedToppings) {
            if (allToppings.contains(topping)) {
                pizza.addTopping(topping);
            } else {
                System.out.println("Invalid topping: " + topping);
            }
        }
    }

    public Pizza getPizza() {
        return pizza;
    }
}