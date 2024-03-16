// Macronutrient.java
package Assignment4.Question2;

// Abstract Factory for creating Carbs, Protein, and Fats factories
public interface Macronutrient {
    CarbsFactory createCarbsFactory();
    ProteinFactory createProteinFactory();
    FatsFactory createFatsFactory();
}
