
public class InternEmployeeSalaryCalculator extends EmployeeSalaryCalculator {
    @Override
    protected double calculateBasicSalary(Employee emp) {
        return emp.getMonthlySalary();
    }

    @Override
    protected double calculateAllowances(Employee emp, double basicSalary) {
        return 0; 
    }

    @Override
    protected double calculateDeductions(Employee emp, double basicSalary) {
        return 0;
    }

    @Override
    protected double calculateTax(Employee emp, double basicSalary, double allowances, double deductions) {
        return 0; 
    }
}
