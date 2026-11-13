public class CharacterStyle {

    private String fontFamily;
    private int fontSize;
    private boolean bold;
    private boolean italic;
    private boolean underline;
    private String color;

    CharacterStyle(String fontFamily, int fontSize, boolean bold, boolean italic, boolean underline, String color) {
        this.fontFamily = fontFamily;
        this.fontSize = fontSize;
        this.bold = bold;
        this.italic = italic;
        this.underline = underline;
        this.color = color;
    }

    public String showStyle() {
        return "(Font Family: " + fontFamily + ", Font Size: " + fontSize + ", Bold: " + bold + ", Italic: " + italic
                + ", Underline: " + underline + ", Color: " + color + ")";
    }
}