final class HospitalDatabaseManager {
    private static HospitalDatabaseManager instance;

    private String value;
    private String connectionStatus;
    private int activeUserCount;

    private HospitalDatabaseManager(String value) {
        this.value = value;
        this.connectionStatus = "Disconnected";
        this.activeUserCount = 0;
    }

    public static HospitalDatabaseManager getInstance(String value) {
        if (instance == null) {
            instance = new HospitalDatabaseManager(value);
        }
        return instance;
    }

    public void connect() {
        if (connectionStatus.equals("Disconnected")) {
            connectionStatus = "Connected";
            System.out.println("Hospital database connected");
        } else {
            System.out.println("Database is already connected");
        }
    }

    public void executeQuery(String query) {
        if (connectionStatus.equals("Connected")) {
            System.out.println("Executing query: " + query);
        } else {
            System.out.println("Cannot run query. Database is disconnected.");
        }
    }

    public void updatePatientRecord(String patientId, String details) {
        if (connectionStatus.equals("Connected")) {
            System.out.println("Updating patient " + patientId + ": " + details);
        } else {
            System.out.println("Cannot update record. Database is disconnected.");
        }
    }

    public void closeConnection() {
        connectionStatus = "Disconnected";
        System.out.println("Database connection closed.");
    }
}