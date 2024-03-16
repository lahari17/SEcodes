// ProteinFactory.java
package Assignment4.Question2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Factory for creating Protein food items based on diet plan
public class ProteinFactory {
    private final List<String> PROTEIN_OPTIONS = List.of("Fish", "Chicken", "Beef", "Tofu");

    public String createProtein(String dietPlan) {
        Random random = new Random();
        List<String> allowedProtein = new ArrayList<>(PROTEIN_OPTIONS);

        switch (dietPlan) {
            case "Vegan":
                allowedProtein.remove("Fish");
                allowedProtein.remove("Chicken");
                allowedProtein.remove("Beef");
                break;
            case "Paleo":
                allowedProtein.remove("Tofu");
                break;
            default:
                break;
        }

        int index = random.nextInt(allowedProtein.size());
        return allowedProtein.get(index);
    }
}
