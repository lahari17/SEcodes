package Assignment7.Question1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TextDocument {
    private List<CharacterData> characters = new ArrayList<>();
    private CharacterPropertiesFactory propertiesFactory;

    public TextDocument(CharacterPropertiesFactory propertiesFactory) {
        this.propertiesFactory = propertiesFactory;
    }

    public void addCharacter(char character, String font, String color, int size) {
        characters.add(new CharacterData(character, font, color, size));
    }

    public List<CharacterData> getCharacters() {
        return characters;
    }

    public void saveToFile(String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (CharacterData characterData : characters) {
                writer.println(characterData);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Document saved to file: " + filename);
    }

    public static TextDocument loadFromFile(String filename, CharacterPropertiesFactory propertiesFactory) {
        TextDocument document = new TextDocument(propertiesFactory);
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    char character = parts[0].charAt(0);
                    String font = parts[1];
                    String color = parts[2];
                    int size = Integer.parseInt(parts[3]);
                    document.addCharacter(character, font, color, size);
                }
            }
            System.out.println("Document loaded from file: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return document;
    }
}
