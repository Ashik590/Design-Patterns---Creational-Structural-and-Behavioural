public class ContractEmployeeSalaryCalculator extends EmployeeSalaryCalculator {
    @Override
    protected double calculateBasicSalary(Employee emp) {
        return emp.getMonthlySalary();
    }

    @Override
    protected double calculateAllowances(Employee emp, double basicSalary) {
        return 1500;
    }

    @Override
    protected double calculateDeductions(Employee emp, double basicSalary) {
        return basicSalary * 0.05;
    }

    @Override
    protected double calculateTax(Employee emp, double basicSalary, double allowances, double deductions) {
        double taxable = basicSalary + allowances - deductions;
        return taxable * 0.08;
    }
}
