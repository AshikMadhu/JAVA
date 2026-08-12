package tutorials;

import java.util.Scanner;

class Learner {

    String name;
    int rollNo;
    String course;

    void setDetails(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
    }
}

class FeeRecord extends Learner {

    double collegeFee;

    void setCollegeFee(double collegeFee) {
        this.collegeFee = collegeFee;
    }
}

class ResidentStudent extends FeeRecord {

    double hostelFee;
    double messFee;

    void setFees(double hostelFee, double messFee) {
        this.hostelFee = hostelFee;
        this.messFee = messFee;
    }

    void displayAll() {

        displayDetails();

        System.out.println("College Fee: " + collegeFee);
        System.out.println("Hostel Fee: " + hostelFee);
        System.out.println("Mess Fee: " + messFee);

        double total = collegeFee + hostelFee + messFee;

        System.out.println("Total Fee: " + total);
    }
}

class CommuterStudent extends FeeRecord {

    double busFee;

    void setBusFee(double busFee) {
        this.busFee = busFee;
    }

    void displayAll() {

        displayDetails();

        System.out.println("College Fee: " + collegeFee);
        System.out.println("Bus Fee: " + busFee);

        double total = collegeFee + busFee;

        System.out.println("Total Fee: " + total);
    }
}

public class LearnerFeeManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ResidentStudent resident = new ResidentStudent();

        System.out.print("Enter Resident Student's Name: ");
        String name1 = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int roll1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        String course1 = sc.nextLine();

        System.out.print("Enter College Fee: ");
        double collegeFee1 = sc.nextDouble();

        System.out.print("Enter Hostel Fee: ");
        double hostelFee = sc.nextDouble();

        System.out.print("Enter Mess Fee: ");
        double messFee = sc.nextDouble();
        sc.nextLine();

        resident.setDetails(name1, roll1, course1);
        resident.setCollegeFee(collegeFee1);
        resident.setFees(hostelFee, messFee);

        CommuterStudent commuter = new CommuterStudent();

        System.out.print("\nEnter Commuter Student's Name: ");
        String name2 = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int roll2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        String course2 = sc.nextLine();

        System.out.print("Enter College Fee: ");
        double collegeFee2 = sc.nextDouble();

        System.out.print("Enter Bus Fee: ");
        double busFee = sc.nextDouble();

        commuter.setDetails(name2, roll2, course2);
        commuter.setCollegeFee(collegeFee2);
        commuter.setBusFee(busFee);

        System.out.println("\n RESIDENT STUDENT DETAILS");
        resident.displayAll();

        System.out.println("\n COMMUTER STUDENT DETAILS");
        commuter.displayAll();

        sc.close();
    }
}