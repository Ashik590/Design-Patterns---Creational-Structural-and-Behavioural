public class EmployeeReport implements Report {

    private ReportExporter reportExporter;

    public EmployeeReport(ReportExporter reportExporter) {
        this.reportExporter = reportExporter;
    }

    @Override
    public void generateReport() {
        System.out.println("Generating employee report.");
        reportExporter.export();
    }
    
}
