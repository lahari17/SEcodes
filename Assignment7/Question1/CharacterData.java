package Assignment7.Question1;

public class CharacterData {
    private char character;
    private String font;
    private String color;
    private int size;

    public CharacterData(char character, String font, String color, int size) {
        this.character = character;
        this.font = font;
        this.color = color;
        this.size = size;
    }

    public char getCharacter() {
        return character;
    }

    public String getFont() {
        return font;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return character + "," + font + "," + color + "," + size;
    }
}
