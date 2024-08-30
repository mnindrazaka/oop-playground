package domain;

public abstract class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printInfo() {
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Monthly Salary : " + getMonthlySalary());
        System.out.println("");
    }

    abstract public int getMonthlySalary();
}
