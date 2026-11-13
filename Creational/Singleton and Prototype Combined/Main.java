public class Main {
    public static void main(String[] args) {
        HospitalDatabaseManager db =
                HospitalDatabaseManager.getInstance("HospitalDBServer");

        db.connect();
        db.updatePatientRecord("id1", "Patient admitted in emergency ward");
        db.executeQuery("some query regarding id1 patient");
        db.closeConnection();

        System.out.println();

        // Prescription prototype
        PrescriptionTemplate basePrescription = new PrescriptionTemplate();
        basePrescription.setHospitalHeader("IIT Hospital");
        basePrescription.setDoctorName("Dr. Aziz");
        basePrescription.setDiagnosis("Fever");
        basePrescription.addMedicine("Paracetamol 5000mg");
        basePrescription.addMedicine("Vitamin Q");

        PrescriptionTemplate p1 = (PrescriptionTemplate) basePrescription.clone();
        p1.setPatientName("Aziza");

        PrescriptionTemplate p2 = (PrescriptionTemplate) basePrescription.clone();
        p2.setPatientName("Ashik");
        p2.addMedicine("Napa");

        p1.printReport();
        System.out.println();
        p2.printReport();

        System.out.println();

        LabReportTemplate baseLabReport = new LabReportTemplate();
        baseLabReport.setHospitalHeader("CSE Hospital");
        baseLabReport.setDoctorName("Dr. Hakim");
        baseLabReport.setDiagnosis("Blood Test");
        baseLabReport.addObservation("normal");
        baseLabReport.addObservation("Sugar high");

        LabReportTemplate lab1 = (LabReportTemplate) baseLabReport.clone();
        lab1.setPatientName("Karim");
        lab1.printReport();

        System.out.println();

        DischargeSummaryTemplate baseSummary = new DischargeSummaryTemplate();
        baseSummary.setHospitalHeader("Narayanganj Hospital");
        baseSummary.setDoctorName("Dr. Moni");
        baseSummary.setDiagnosis("recovered from surgery");
        baseSummary.addSummaryPoint("patient stayed for 5 days");
        baseSummary.addSummaryPoint("condition is stable");

        DischargeSummaryTemplate summary1 =
                (DischargeSummaryTemplate) baseSummary.clone();
        summary1.setPatientName("Rakib");
        summary1.printReport();
    }
}