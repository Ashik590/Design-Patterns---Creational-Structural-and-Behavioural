public class DocumentCharacter {
    private char value;
    private int line_number;
    private int column_number;
    private CharacterStyle style;

    DocumentCharacter(char value, int line_number, int column_number, CharacterStyle style) {
        this.value = value;
        this.line_number = line_number;
        this.column_number = column_number;
        this.style = style;
    }

    public String showCharacter() {
        return "Character: '" + value + "', Line: " + line_number + ", Column: " + column_number + ", Style: "
                + style.showStyle();
    }

    public int getLineNumber() {
        return line_number;
    }

    public int getColumnNumber() {
        return column_number;
    }

    public void setStyle(CharacterStyle style) {
        this.style = style;
    }

    public void setValue(char value) {
        this.value = value;
    }
}