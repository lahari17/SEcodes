// MainDriver.java
package Assignment4.Question2;

public class MainDriver {
    public static void main(String[] args) {
        MacronutrientFactory macronutrientFactory = MacronutrientFactory.getInstance();

        // Create customers with different diet plans
        Customer customer1 = new Customer("Cust1", "No Restriction");
        Customer customer2 = new Customer("Cust2", "Paleo");
        Customer customer3 = new Customer("Cust3", "Vegan");
        Customer customer4 = new Customer("Cust4", "Nut Allergy");
        Customer customer5 = new Customer("Cust5", "No Restriction");
        Customer customer6 = new Customer("Cust6", "Paleo");

        // Generate meals for each customer
        generateMeal(customer1, macronutrientFactory);
        generateMeal(customer2, macronutrientFactory);
        generateMeal(customer3, macronutrientFactory);
        generateMeal(customer4, macronutrientFactory);
        generateMeal(customer5, macronutrientFactory);
        generateMeal(customer6, macronutrientFactory);
    }

    private static void generateMeal(Customer customer, MacronutrientFactory macronutrientFactory) {
        CarbsFactory carbsFactory = macronutrientFactory.createCarbsFactory();
        ProteinFactory proteinFactory = macronutrientFactory.createProteinFactory();
        FatsFactory fatsFactory = macronutrientFactory.createFatsFactory();

        System.out.println("Meal for customer: " + customer.getName());
        String carbs = carbsFactory.createCarbs(customer.getDietPlan());
        String protein = proteinFactory.createProtein(customer.getDietPlan());
        String fats = fatsFactory.createFats(customer.getDietPlan());

        System.out.println("Carbs: " + carbs);
        System.out.println("Protein: " + protein);
        System.out.println("Fats: " + fats);
        System.out.println();
    }
}
