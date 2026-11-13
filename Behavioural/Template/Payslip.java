public class Payslip {
    private String employeeId;
    private String employeeName;
    private double basicSalary;
    private double allowances;
    private double deductions;
    private double tax;
    private double netSalary;

    public Payslip(String employeeId, String employeeName, double basicSalary, double allowances, double deductions,
            double tax) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.allowances = allowances;
        this.deductions = deductions;
        this.tax = tax;
        this.netSalary = basicSalary + allowances - deductions - tax;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Payslip for ").append(employeeName).append(" (ID: ").append(employeeId).append(")\n");
        sb.append("-------------------------------------\n");
        sb.append(String.format("Basic Salary : %.2f\n", basicSalary));
        sb.append(String.format("Allowances    : %.2f\n", allowances));
        sb.append(String.format("Deductions    : %.2f\n", deductions));
        sb.append(String.format("Tax           : %.2f\n", tax));
        sb.append("-------------------------------------\n");
        sb.append(String.format("Net Salary    : %.2f\n", netSalary));
        return sb.toString();
    }
}
