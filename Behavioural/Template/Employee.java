
public class Employee {
    private String id;
    private String name;
    private String designation;
    private String employeeType;
    private String department;

    private double monthlySalary; // for permanent/contract
    private double hourlyRate; // for hourly
    private double hoursWorked; // for hourly

    public Employee(String id, String name, String designation, String employeeType, String department) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.employeeType = employeeType;
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public String getDepartment() {
        return department;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
