package pack;
import java.util.ArrayList;
import java.util.List;

public class ActivityLogger {
    private List<String> logs;

    ActivityLogger() {
        logs = new ArrayList<>();
    }

    public void addLog(String log) {
        logs.add(log);
    }

    public void printLogs() {
        System.out.println("Activity Logs:");
        for (String log : logs) {
            System.out.println(log);
        }
    }
}
