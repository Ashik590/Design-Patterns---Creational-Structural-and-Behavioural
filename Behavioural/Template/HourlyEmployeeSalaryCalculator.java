
public class HourlyEmployeeSalaryCalculator extends EmployeeSalaryCalculator {
    @Override
    protected double calculateBasicSalary(Employee emp) {
        return emp.getHoursWorked() * emp.getHourlyRate();
    }

    @Override
    protected double calculateAllowances(Employee emp, double basicSalary) {
        return emp.getHoursWorked() * 5;
    }

    @Override
    protected double calculateDeductions(Employee emp, double basicSalary) {
        return basicSalary * 0.02;
    }

    @Override
    protected double calculateTax(Employee emp, double basicSalary, double allowances, double deductions) {
        double taxable = basicSalary + allowances - deductions;
        if (taxable <= 20000)
            return 0;
        return (taxable - 20000) * 0.05;
    }
}
