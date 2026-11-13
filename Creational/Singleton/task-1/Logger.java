import java.util.ArrayList;

public final class Logger {
    private static volatile Logger instance;

    private String logFilePath;
    private String currentSessionId;
    private ArrayList<String> logs;

    private Logger() {
        logFilePath = "./something.txt";
        currentSessionId = "something";
        logs = new ArrayList<>();
    }

    public static Logger getInstance() {
        Logger result = instance;
        if (result != null) {
            return result;
        }
        synchronized (Logger.class) {
            if (instance == null) {
                instance = new Logger();
            }
            return instance;
        }
    }

    private String generateTimestamp() {
        return java.time.LocalDateTime.now().toString();
    }

    public void logActivity(String message) {
        logs.add(generateTimestamp() + " " + message);
    }

    public ArrayList<String> getLogs() {
        return logs;
    }

    public void writeToFile() {
        // ---
    }
}
