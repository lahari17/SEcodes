package Assignment7.Question1;


import java.util.HashMap;
import java.util.Map;

// Flyweight factory
public class CharacterPropertiesFactory {
    private Map<String, CharacterProperties> propertiesMap = new HashMap<>();

    public CharacterProperties getCharacterProperties(String font, String color, int size) {
        String key = font + color + size;
        if (!propertiesMap.containsKey(key)) {
            propertiesMap.put(key, new ConcreteCharacterProperties(font, color, size));
        }
        return propertiesMap.get(key);
    }
}

