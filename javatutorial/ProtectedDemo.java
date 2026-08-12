package tutorials;

class Emp {

    protected double salary = 50000;

    protected void displaySalary() {
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Emp {

    void displayDetails() {

        System.out.println("Manager Salary: " + salary);

        displaySalary();
    }
}

public class ProtectedDemo {

    public static void main(String[] args) {

        Manager obj = new Manager();

        obj.displayDetails();
    }
}