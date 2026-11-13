public class Doctor {

    private final HospitalDatabaseManager db = HospitalDatabaseManager.getInstance();

    public void updateDiagnosis(int patientId, String diagnosis) {
        String query = "UPDATE patients SET diagnosis = '"
                + diagnosis + "' WHERE id = " + patientId;

        db.executeQuery(query);
    }

    public void createPrescription(int patientId, String medicine) {
        String query = "INSERT INTO prescriptions (patient_id, medicine) "
                + "VALUES (" + patientId + ", '" + medicine + "')";

        db.executeQuery(query);
    }
}