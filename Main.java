import domain.*;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee fulltimeEmployee = new FullTimeEmployee(1, "edo", 12000000);
        fulltimeEmployee.printInfo();

        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(2, "mardin", 10000, 4);
        partTimeEmployee.printInfo();

        InternEmployee internEmployee = new InternEmployee(3, "nur", 1000000);
        internEmployee.printInfo();
    }
}
