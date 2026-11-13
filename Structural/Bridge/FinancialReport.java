public class FinancialReport implements Report {
    private ReportExporter reportExporter;

    public FinancialReport(ReportExporter reportExporter) {
        this.reportExporter = reportExporter;
    }

    @Override
    public void generateReport() {
        System.out.println("Generating financial report.");
        reportExporter.export();
    }
}
