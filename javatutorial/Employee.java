package tutorials;

import java.util.Scanner;

public class Employee {

    int empId;
    String empName;
    double salary;

    Employee(int empId, String empName, double salary) {
        this.empId = empId;
        this.empName = empName;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee 1 ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee 1 Name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter Employee 1 Salary: ");
        double salary1 = sc.nextDouble();

        Employee emp1 = new Employee(id1, name1, salary1);

        System.out.print("\nEnter Employee 2 ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee 2 Name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter Employee 2 Salary: ");
        double salary2 = sc.nextDouble();

        Employee emp2 = new Employee(id2, name2, salary2);

        System.out.println("\nEMPLOYEE DETAILS");

        System.out.println("\nEmployee 1:");
        emp1.displayEmployee();

        System.out.println("\nEmployee 2:");
        emp2.displayEmployee();

        sc.close();
    }
}