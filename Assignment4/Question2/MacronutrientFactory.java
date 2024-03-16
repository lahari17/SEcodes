// MacronutrientFactory.java
package Assignment4.Question2;

// Singleton implementation of Macronutrient Factory
public class MacronutrientFactory implements Macronutrient {
    private static MacronutrientFactory instance;

    private MacronutrientFactory() {}

    public static synchronized MacronutrientFactory getInstance() {
        if (instance == null) {
            instance = new MacronutrientFactory();
        }
        return instance;
    }

    @Override
    public CarbsFactory createCarbsFactory() {
        return new CarbsFactory();
    }

    @Override
    public ProteinFactory createProteinFactory() {
        return new ProteinFactory();
    }

    @Override
    public FatsFactory createFatsFactory() {
        return new FatsFactory();
    }
}
