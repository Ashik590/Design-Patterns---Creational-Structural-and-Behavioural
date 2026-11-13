public class SettingsScreen {
    public void changeVolume(int volume) {
        GameSettingsManager.getInstance().setVolumeLevel(volume);
    }

    public void updateDifficulty(String diffLvl) {
        GameSettingsManager.getInstance().setDifficultyMode(diffLvl);
    }

    public void changeLanguage(String lang) {
        GameSettingsManager.getInstance().setLanguage(lang);
    }

    public void changeBrightness(int brightness) {
        GameSettingsManager.getInstance().setBrightness(brightness);
    }

    public void changeResolution(String resolution) {
        GameSettingsManager.getInstance().setResolution(resolution);
    }
}
