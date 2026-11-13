public class SalesReport implements Report {

    private ReportExporter reportExporter;

    public SalesReport(ReportExporter reportExporter) {
        this.reportExporter = reportExporter;
    }

    @Override
    public void generateReport() {
        System.out.println("Generating sales report.");
        reportExporter.export();
    }
    
}
