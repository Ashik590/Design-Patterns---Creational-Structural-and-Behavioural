public class Main {
    public static void main(String[] args) {
        Report studentReport = new StudentReport(new PDFExporter());
        studentReport.generateReport();

        Report employeeReport = new EmployeeReport(new HTMLExporter());
        employeeReport.generateReport();

        Report salesReport = new SalesReport(new ExcelExporter());
        salesReport.generateReport();
    }
}
