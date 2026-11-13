public class Editor {
    private Document document;
    private StyleFactory styleFactory;
    private CharacterStyle currentStyle;
    private StatisticsManager statisticsManager;

    public Editor(){
        document = new Document();
        styleFactory = new StyleFactory();
        currentStyle = styleFactory.getStyle("Arial", 12, false, false, false, "black");
        statisticsManager = new StatisticsManager();
    }

    public void selectStyle(String fontFamily, int fontSize, boolean bold, boolean italic, boolean underline, String color) {
        CharacterStyle style = styleFactory.getStyle(fontFamily, fontSize, bold, italic, underline, color);

        this.currentStyle = style;
    }

    public void insertCharacter(char value, int line_number, int column_number) {
        DocumentCharacter character = new DocumentCharacter(value, line_number, column_number, currentStyle);
        document.insertCharacter(character);
    }

    public void removeCharacter(int line_number, int column_number) {
        document.removeCharacter(line_number, column_number);
    }

    public void updateCharacter(int line_number, int column_number, char value) {
        document.updateCharacter(line_number, column_number, value, currentStyle);
    }

    public void displayDocument() {
        document.displayDocument();
    }

    public void createNewDocument() {
        document = new Document();
        styleFactory = new StyleFactory();
        currentStyle = styleFactory.getStyle("Arial", 12, false, false, false, "black");
    }

    public void displayStatistics() {
        statisticsManager.displayStatistics(document, styleFactory);
    }
}
