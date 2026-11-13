
public final class GameSettingsManager {
    private static volatile GameSettingsManager instance;
    private String difficultyMode, language, resolution;

    private int volumeLevel, brightness;

    private GameSettingsManager() {
        difficultyMode = "Medium";
        language = "English";
        brightness = 70;
        volumeLevel = 50;
        resolution = "HD";
    }

    public static GameSettingsManager getInstance() {
        GameSettingsManager result = instance;
        if (result != null) {
            return result;
        }
        synchronized (GameSettingsManager.class) {
            if (instance == null) {
                instance = new GameSettingsManager();
            }
            return instance;
        }
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public void setVolumeLevel(int volumeLevel) {
        this.volumeLevel = volumeLevel;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setDifficultyMode(String difficultyMode) {
        this.difficultyMode = difficultyMode;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getDifficultyMode() {
        return difficultyMode;
    }

    public String getLanguage() {
        return language;
    }

    public int getBrightness() {
        return brightness;
    }

    public String getResolution() {
        return resolution;
    }

    public void loadSettings() {
        // ..
    }

    public void saveSettings() {
        // ..
    }
}
