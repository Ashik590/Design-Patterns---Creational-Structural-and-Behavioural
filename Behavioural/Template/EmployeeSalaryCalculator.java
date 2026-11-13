
public abstract class EmployeeSalaryCalculator {
    public final Payslip calculateSalary(Employee emp) {
        loadEmployeeInfo(emp);
        double basic = calculateBasicSalary(emp);
        double allowances = calculateAllowances(emp, basic);
        double deductions = calculateDeductions(emp, basic);
        double tax = calculateTax(emp, basic, allowances, deductions);
        Payslip payslip = generatePayslip(emp, basic, allowances, deductions, tax);
        return payslip;
    }

    protected void loadEmployeeInfo(Employee emp) {
        // default behaviour
    }

    protected abstract double calculateBasicSalary(Employee emp);

    protected abstract double calculateAllowances(Employee emp, double basicSalary);

    protected abstract double calculateDeductions(Employee emp, double basicSalary);

    protected abstract double calculateTax(Employee emp, double basicSalary, double allowances, double deductions);

    protected Payslip generatePayslip(Employee emp, double basicSalary, double allowances, double deductions,
            double tax) {
        Payslip p = new Payslip(emp.getId(), emp.getName(), basicSalary, allowances, deductions, tax);
        // default printing for demo
        System.out.println(p);
        return p;
    }
}
