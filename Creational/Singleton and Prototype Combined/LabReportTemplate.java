import java.util.ArrayList;
import java.util.List;

class LabReportTemplate extends MedicalReport {
    private List<String> testResults;

    public LabReportTemplate() {
        super();
        this.testResults = new ArrayList<>();
    }

    public LabReportTemplate(LabReportTemplate source) {
        super(source);
        this.testResults = new ArrayList<>(source.testResults);
    }

    public void addObservation(String observation) {
        testResults.add(observation);
    }

    @Override
    public MedicalReport clone() {
        return new LabReportTemplate(this);
    }

    @Override
    public String generateReport() {
        StringBuilder sb = new StringBuilder();
        sb.append("Laboratory Report\n");
        sb.append("Date: ").append(reportDate).append("\n");
        sb.append("Patient: ").append(patientName).append("\n");
        sb.append("Doctor: ").append(doctorName).append("\n");
        sb.append("Diagnosis: ").append(diagnosis).append("\n");
        sb.append("Observations:\n");

        for (String result : testResults) {
            sb.append("- ").append(result).append("\n");
        }

        return sb.toString();
    }
}