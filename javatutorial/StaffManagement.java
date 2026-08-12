package tutorials;

import java.util.Scanner;

class Staff {

    String name;
    String address;
    int age;
    String mobile;
    float salary;

    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

class Executive extends Staff {

    String specialization;

    void printSpecialization() {
        System.out.println("Specialization: " + specialization);
    }
}

class DepartmentHead extends Staff {

    String department;

    void printDepartment() {
        System.out.println("Department: " + department);
    }
}

public class StaffManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Executive executive = new Executive();

        System.out.print("Enter Executive's Name: ");
        executive.name = sc.nextLine();

        System.out.print("Enter Address: ");
        executive.address = sc.nextLine();

        System.out.print("Enter Age: ");
        executive.age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Mobile: ");
        executive.mobile = sc.nextLine();

        System.out.print("Enter Salary: ");
        executive.salary = sc.nextFloat();
        sc.nextLine();

        System.out.print("Enter Specialization: ");
        executive.specialization = sc.nextLine();

        DepartmentHead head = new DepartmentHead();

        System.out.print("\nEnter Department Head's Name: ");
        head.name = sc.nextLine();

        System.out.print("Enter Address: ");
        head.address = sc.nextLine();

        System.out.print("Enter Age: ");
        head.age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Mobile: ");
        head.mobile = sc.nextLine();

        System.out.print("Enter Salary: ");
        head.salary = sc.nextFloat();
        sc.nextLine();

        System.out.print("Enter Department: ");
        head.department = sc.nextLine();

        System.out.println("\nEXECUTIVE DETAILS");
        System.out.println("Name: " + executive.name);
        System.out.println("Address: " + executive.address);
        System.out.println("Age: " + executive.age);
        System.out.println("Mobile: " + executive.mobile);
        executive.printSalary();
        executive.printSpecialization();

        System.out.println("\nDEPARTMENT HEAD DETAILS");
        System.out.println("Name: " + head.name);
        System.out.println("Address: " + head.address);
        System.out.println("Age: " + head.age);
        System.out.println("Mobile: " + head.mobile);
        head.printSalary();
        head.printDepartment();

        sc.close();
    }
}