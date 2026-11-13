import java.util.ArrayList;
import java.util.List;

class DischargeSummaryTemplate extends MedicalReport {
    private List<String> summaryPoints;

    public DischargeSummaryTemplate() {
        super();
        this.summaryPoints = new ArrayList<>();
    }

    public DischargeSummaryTemplate(DischargeSummaryTemplate source) {
        super(source);
        this.summaryPoints = new ArrayList<>(source.summaryPoints);
    }

    public void addSummaryPoint(String point) {
        summaryPoints.add(point);
    }

    @Override
    public MedicalReport clone() {
        return new DischargeSummaryTemplate(this);
    }

    @Override
    public String generateReport() {
        StringBuilder sb = new StringBuilder();
        sb.append("Discharge Summary\n");
        sb.append("Date: ").append(reportDate).append("\n");
        sb.append("Patient: ").append(patientName).append("\n");
        sb.append("Doctor: ").append(doctorName).append("\n");
        sb.append("Diagnosis: ").append(diagnosis).append("\n");
        sb.append("Summary:\n");

        for (String point : summaryPoints) {
            sb.append("- ").append(point).append("\n");
        }

        return sb.toString();
    }
}