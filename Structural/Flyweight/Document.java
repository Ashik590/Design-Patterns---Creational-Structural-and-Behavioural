import java.util.List;
import java.util.ArrayList;

public class Document {
    private List<DocumentCharacter> characters;

    public Document() {
        this.characters = new ArrayList<>();
    }

    public void insertCharacter(DocumentCharacter character) {
        characters.add(character);
    }

    public void removeCharacter(int line_number, int column_number) {
        characters.removeIf(
                character -> character.getLineNumber() == line_number && character.getColumnNumber() == column_number);
    }

    public void updateCharacter(int line_number, int column_number, char value, CharacterStyle newStyle) {
        for (DocumentCharacter character : characters) {
            if (character.getLineNumber() == line_number && character.getColumnNumber() == column_number) {
                character.setStyle(newStyle);
                character.setValue(value);
                break;
            }
        }
    }

    public void displayDocument() {
        for (DocumentCharacter character : characters) {
            System.out.println(character.showCharacter());
        }
    }

    public int getCharacterCount() {
        return characters.size();
    }
}
