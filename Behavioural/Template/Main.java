
public class Main {
    public static void main(String[] args) {
        Employee p = new Employee("E001", "Alice", "Software Engineer", "Permanent", "Engineering");
        p.setMonthlySalary(60000);

        Employee c = new Employee("E002", "Bob", "Consultant", "Contract", "IT");
        c.setMonthlySalary(40000);

        Employee h = new Employee("E003", "Charlie", "Support", "Hourly", "Support");
        h.setHourlyRate(250);
        h.setHoursWorked(160);

        Employee i = new Employee("E004", "Dana", "Intern", "Intern", "Research");
        i.setMonthlySalary(8000);

        EmployeeSalaryCalculator permCalc = new PermanentEmployeeSalaryCalculator();
        EmployeeSalaryCalculator contractCalc = new ContractEmployeeSalaryCalculator();
        EmployeeSalaryCalculator hourlyCalc = new HourlyEmployeeSalaryCalculator();
        EmployeeSalaryCalculator internCalc = new InternEmployeeSalaryCalculator();

        System.out.println("--- Processing Permanent Employee ---");
        permCalc.calculateSalary(p);

        System.out.println("--- Processing Contract Employee ---");
        contractCalc.calculateSalary(c);

        System.out.println("--- Processing Hourly Employee ---");
        hourlyCalc.calculateSalary(h);

        System.out.println("--- Processing Intern Employee (extensibility demo) ---");
        internCalc.calculateSalary(i);
    }
}
