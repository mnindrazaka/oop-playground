package domain;

public class PartTimeEmployee extends Employee {
    private int hourlyWage;
    private int hoursWorked;

    public PartTimeEmployee(int id, String name, int hourlyWage, int hoursWorked) {
        super(id, name);
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }

    public int getMonthlySalary() {
        return hourlyWage * hoursWorked * 22;
    }

}