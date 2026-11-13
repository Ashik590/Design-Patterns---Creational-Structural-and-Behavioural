public class Receptionist {

    private final HospitalDatabaseManager db = HospitalDatabaseManager.getInstance();

    public void registerPatient(int patientId, String patientName) {
        String query = "INSERT INTO patients (id, name) VALUES ("
                + patientId + ", '" + patientName + "')";

        db.executeQuery(query);
    }

    public void assignRoom(int patientId, int roomNumber) {
        String query = "UPDATE patients SET room_number = "
                + roomNumber + " WHERE id = " + patientId;

        db.executeQuery(query);
    }
}