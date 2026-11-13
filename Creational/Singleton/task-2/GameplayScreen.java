public class GameplayScreen {
    public void displayCurrentSettings() {
        System.out.println("Current Settings: ");
        System.out.println("Difficulty Level = " + GameSettingsManager.getInstance().getDifficultyMode());
        System.out.println("Language = " + GameSettingsManager.getInstance().getLanguage());
        System.out.println("Volume = " + GameSettingsManager.getInstance().getVolumeLevel());
        System.out.println("Brightness = " + GameSettingsManager.getInstance().getBrightness());
        System.out.println("Resolution = " + GameSettingsManager.getInstance().getResolution());
    }
}