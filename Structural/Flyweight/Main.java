public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.insertCharacter('H', 1, 1);
        editor.insertCharacter('e', 1, 2);
        editor.insertCharacter('l', 1, 3);
        editor.insertCharacter('l', 1, 4);
        editor.insertCharacter('o', 1, 5);
        editor.insertCharacter(' ', 1, 6);

        editor.selectStyle("Times New Roman", 14, true, false, false, "blue");
        editor.insertCharacter('W', 1, 7);
        editor.insertCharacter('o', 1, 8);
        editor.insertCharacter('r', 1, 9);
        editor.insertCharacter('l', 1, 10);
        editor.insertCharacter('d', 1, 11);

        editor.displayDocument();
        editor.displayStatistics();

        // StyleFactory styleFactory = new StyleFactory();
        // CharacterStyle style1 = styleFactory.getStyle("Arial", 12, false, false,
        // false, "black");
    }
}
