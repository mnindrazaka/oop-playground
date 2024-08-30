package domain;

public class InternEmployee extends Employee {
    private int monthlySalary;

    public InternEmployee(int id, String name, int monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    public int getMonthlySalary() {
        return monthlySalary;
    }
}