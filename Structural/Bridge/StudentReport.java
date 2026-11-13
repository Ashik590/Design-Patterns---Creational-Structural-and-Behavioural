public class StudentReport implements Report {

    private ReportExporter reportExporter;

    public StudentReport(ReportExporter reportExporter) {
        this.reportExporter = reportExporter;
    }

    @Override
    public void generateReport() {
        System.out.println("Generating student report.");
        reportExporter.export();
    }
}
