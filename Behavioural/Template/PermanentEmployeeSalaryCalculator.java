
public class PermanentEmployeeSalaryCalculator extends EmployeeSalaryCalculator {
    @Override
    protected double calculateBasicSalary(Employee emp) {
        return emp.getMonthlySalary();
    }

    @Override
    protected double calculateAllowances(Employee emp, double basicSalary) {
        double hra = basicSalary * 0.20;
        double medical = basicSalary * 0.05;
        double transport = basicSalary * 0.05;
        return hra + medical + transport;
    }

    @Override
    protected double calculateDeductions(Employee emp, double basicSalary) {
        double pf = basicSalary * 0.12;
        double other = 200;
        return pf + other;
    }

    @Override
    protected double calculateTax(Employee emp, double basicSalary, double allowances, double deductions) {
        double taxable = basicSalary + allowances - deductions;
        
        if (taxable <= 30000)
            return taxable * 0.05;
        if (taxable <= 70000)
            return taxable * 0.10;
        return taxable * 0.15;
    }
}
