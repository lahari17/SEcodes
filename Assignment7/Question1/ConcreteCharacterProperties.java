package Assignment7.Question1;

// Concrete flyweight class
public class ConcreteCharacterProperties implements CharacterProperties {
    private String font;
    private String color;
    private int size;

    public ConcreteCharacterProperties(String font, String color, int size) {
        this.font = font;
        this.color = color;
        this.size = size;
    }


    // Getter methods for font, color, and size
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
    public void display() {
        System.out.println("Font: " + font + ", Color: " + color + ", Size: " + size);
    }
}

