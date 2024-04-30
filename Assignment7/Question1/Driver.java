package Assignment7.Question1;

public class Driver {
    private static final CharacterPropertiesFactory propertiesFactory = new CharacterPropertiesFactory();

    public static void main(String[] args) {
        // Sample usage
        createAndDisplayCharacter('H', "Arial", "Red", 12);
        createAndDisplayCharacter('e', "Calibri", "Blue", 14);
        createAndDisplayCharacter('l', "Verdana", "Black", 16);
        createAndDisplayCharacter('l', "Arial", "Red", 12);
        createAndDisplayCharacter('o', "Calibri", "Blue", 14);
        createAndDisplayCharacter('W', "Verdana", "Black", 16);
        createAndDisplayCharacter('o', "Arial", "Red", 12);
        createAndDisplayCharacter('r', "Calibri", "Blue", 14);
        createAndDisplayCharacter('l', "Verdana", "Black", 16);
        createAndDisplayCharacter('d', "Arial", "Red", 12);
        createAndDisplayCharacter('5', "Arial", "Green", 18);
        createAndDisplayCharacter('8', "Arial", "Green", 18);
        createAndDisplayCharacter('0', "Arial", "Green", 18);
        createAndDisplayCharacter('0', "Arial", "Green", 18);

        // Save document to file
        TextDocument document = new TextDocument(propertiesFactory);
        document.addCharacter('H', "Arial", "Red", 12);
        document.addCharacter('e', "Calibri", "Blue", 14);
        document.addCharacter('l', "Verdana", "Black", 16);
        document.addCharacter('l', "Arial", "Red", 12);
        document.addCharacter('o', "Calibri", "Blue", 14);
        document.addCharacter('W', "Verdana", "Black", 16);
        document.addCharacter('o', "Arial", "Red", 12);
        document.addCharacter('r', "Calibri", "Blue", 14);
        document.addCharacter('l', "Verdana", "Black", 16);
        document.addCharacter('d', "Arial", "Red", 12);
        document.addCharacter('5', "Arial", "Green", 18);
        document.addCharacter('8', "Arial", "Green", 18);
        document.addCharacter('0', "Arial", "Green", 18);
        document.addCharacter('0', "Arial", "Green", 18);
        document.saveToFile("document.txt");

        TextDocument loadedDocument = TextDocument.loadFromFile("document.txt", propertiesFactory);
        System.out.println("\nLoaded document:");
        for (CharacterData characterData : loadedDocument.getCharacters()) { // Adjusted the import
            createAndDisplayCharacter(characterData.getCharacter(), characterData.getFont(), characterData.getColor(), characterData.getSize());
        }
    }

    private static void createAndDisplayCharacter(char character, String font, String color, int size) {
        CharacterProperties properties = propertiesFactory.getCharacterProperties(font, color, size);
        System.out.print(character + " ");
        properties.display();
    }
}
