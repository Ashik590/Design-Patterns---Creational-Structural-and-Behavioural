public class DatabaseConnectionManager {
    private static DatabaseConnectionManager instance;
    private String connectionStatus;
    private String databaseURL;
    private String username;
    private String password;
    private int activeConnectionCount;

    private DatabaseConnectionManager() {
        this.connectionStatus = "disconnected";
        this.databaseURL = "some url";
        this.username = "admin_ashik";
        this.password = "12345";
        this.activeConnectionCount = 0;
    }

    public static synchronized DatabaseConnectionManager getInstance() {
        if (instance == null) {
            instance = new DatabaseConnectionManager();
        }
        return instance;
    }

    public void connect() {
        if (connectionStatus.equals("disconnected")) {
            connectionStatus = "Connected";
            activeConnectionCount++;
            System.out.println("Connected to database" );
        } else {
            System.out.println("Already connected.");
        }
    }

    public void disconnect() {
        if (connectionStatus.equals("Connected")) {
            connectionStatus = "disconnected";
            activeConnectionCount = Math.max(0, activeConnectionCount - 1);
            System.out.println("disconnected from database.");
        } else {
            System.out.println("Already disconnected.");
        }
    }

    public void executeQuery(String query) {
        if (!connectionStatus.equals("Connected")) {
            System.out.println("Cannot execute query. No active connection.");
            return;
        }
        System.out.println("Executing query: " + query);
    }

    public void beginTransaction() {
        if (!connectionStatus.equals("Connected")) {
            System.out.println("Cannot begin transaction. No active connection.");
            return;
        }
        System.out.println("Transaction started.");
    }

    public void closeConnection() {
        disconnect();
        System.out.println("Connection closed safely.");
    }

    public String getConnectionStatus() {
        return connectionStatus;
    }

    public int getActiveConnectionCount() {
        return activeConnectionCount;
    }
}