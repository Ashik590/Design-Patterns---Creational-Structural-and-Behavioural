public class Main {
    public static void main(String[] args) {
        SettingsScreen ss = new SettingsScreen();
        GameplayScreen gps = new GameplayScreen();

        // gps.displayCurrentSettings();
        ss.changeVolume(80);
        ss.changeBrightness(100);
        ss.changeLanguage("Bangla");

        gps.displayCurrentSettings();
    }
}
