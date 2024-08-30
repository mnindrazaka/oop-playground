package domain;

public class FullTimeEmployee extends Employee {
    private int annualSalary;

    public FullTimeEmployee(int id, String name, int annualSalary) {
        super(id, name);
        this.annualSalary = annualSalary;
    }

    public int getMonthlySalary() {
        return annualSalary * 12;
    }
}