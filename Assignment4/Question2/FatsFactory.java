// FatsFactory.java
package Assignment4.Question2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Factory for creating Fats food items based on diet plan
public class FatsFactory {
    private final List<String> FATS_OPTIONS = List.of("Avocado", "Sour cream", "Tuna", "Peanuts");

    public String createFats(String dietPlan) {
        Random random = new Random();
        List<String> allowedFats = new ArrayList<>(FATS_OPTIONS);

        switch (dietPlan) {
            case "Paleo":
                allowedFats.remove("Avocado");
                allowedFats.remove("Sour cream");
                break;
            case "Vegan":
                allowedFats.remove("Tuna");
                allowedFats.remove("Sour cream");
                break;
            case "Nut Allergy":
                allowedFats.remove("Peanuts");
                break;
            default:
                break;
        }

        int index = random.nextInt(allowedFats.size());
        return allowedFats.get(index);
    }
}
