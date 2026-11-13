abstract class MedicalReport {
    protected String patientName;
    protected String doctorName;
    protected String diagnosis;
    protected String reportDate;
    protected String hospitalHeader;

    public MedicalReport() {
        this.reportDate = java.time.LocalDate.now().toString();
    }

    public MedicalReport(MedicalReport source) {
        this.patientName = source.patientName;
        this.doctorName = source.doctorName;
        this.diagnosis = source.diagnosis;
        this.reportDate = source.reportDate;
        this.hospitalHeader = source.hospitalHeader;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    public void setHospitalHeader(String hospitalHeader) {
        this.hospitalHeader = hospitalHeader;
    }

    public abstract MedicalReport clone();

    public abstract String generateReport();

    public void printReport() {
        System.out.println(generateReport());
    }
}