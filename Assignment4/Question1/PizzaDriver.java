package Assignment4.Question1;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class PizzaDriver {

    public void constructPizza(PizzaBuilder builder, String pizzaChain, String size, int numberOfToppings, List<String> selectedToppings) {
        builder.setPizzaChain(pizzaChain);
        builder.setSize(size);
        builder.setToppings(numberOfToppings, selectedToppings);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PizzaDriver director = new PizzaDriver();
        PizzaBuilder builder = new PizzaConcreteBuilder();

        // Create pizzas for Pizza Hut
        System.out.println("Creating pizzas for Pizza Hut:");
        createAndEatPizza(builder, director, "Pizza Hut", "Small", 3, scanner);
        createAndEatPizza(builder, director, "Pizza Hut", "Medium", 6, scanner);
        createAndEatPizza(builder, director, "Pizza Hut", "Large", 9, scanner);

        createAndEatPizza(builder, director, "Pizza Hut", "Large", 3, scanner);
        createAndEatPizza(builder, director, "Pizza Hut", "Small", 2, scanner);

        // Create pizzas for Little Caesars
        System.out.println("\nCreating pizzas for Little Caesars:");
        createAndEatPizza(builder, director, "Little Caesars", "Medium", 8, scanner);
        createAndEatPizza(builder, director, "Little Caesars", "Small", 6, scanner);

        // Create pizzas for Dominos
        System.out.println("\nCreating pizzas for Dominos:");
        createAndEatPizza(builder, director, "Dominos", "Small", 1, scanner);
        createAndEatPizza(builder, director, "Dominos", "Large", 3, scanner);

        scanner.close();
    }

    // Helper method to create and eat a pizza
    private static void createAndEatPizza(PizzaBuilder builder, PizzaDriver director, String pizzaChain, String size, int numberOfToppings, Scanner scanner) {
        System.out.println("Creating " + size + " pizza with " + numberOfToppings + " toppings for " + pizzaChain + ":");
        director.constructPizza(builder, pizzaChain, size, numberOfToppings, selectToppings(scanner, numberOfToppings));
        Pizza pizza = builder.getPizza();
        pizza.eat();
    }

    // Helper method to select toppings
    private static List<String> selectToppings(Scanner scanner, int numberOfToppings) {
        List<String> selectedToppings = new ArrayList<>();
        for (int i = 0; i < numberOfToppings; i++) {
            System.out.println("Enter topping " + (i + 1) + ":");
            selectedToppings.add(scanner.nextLine());
        }
        return selectedToppings;
    }

}