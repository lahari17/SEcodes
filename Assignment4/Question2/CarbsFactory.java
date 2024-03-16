// CarbsFactory.java
package Assignment4.Question2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Factory for creating Carbs food items based on diet plan
public class CarbsFactory {
    private final List<String> CARBS_OPTIONS = List.of("Cheese", "Bread", "Lentils", "Pistachio");

    public String createCarbs(String dietPlan) {
        Random random = new Random();
        List<String> allowedCarbs = new ArrayList<>(CARBS_OPTIONS);

        switch (dietPlan) {
            case "Paleo":
                allowedCarbs.remove("Bread");
                allowedCarbs.remove("Lentils");
                allowedCarbs.remove("Cheese");
                break;
            case "Vegan":
                allowedCarbs.remove("Cheese");
                break;
            case "Nut Allergy":
                allowedCarbs.remove("Pistachio");
                break;
            default:
                break;
        }

        int index = random.nextInt(allowedCarbs.size());
        return allowedCarbs.get(index);
    }
}
