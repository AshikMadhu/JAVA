package tutorials;

import java.util.Scanner;

public class Marks {

    double mark1;
    double mark2;
    double mark3;

    Marks(double mark1, double mark2, double mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }

    double calculateTotal() {
        return mark1 + mark2 + mark3;
    }

    double calculateAverage() {
        return calculateTotal() / 3;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mark 1: ");
        double mark1 = sc.nextDouble();

        System.out.print("Enter mark 2: ");
        double mark2 = sc.nextDouble();

        System.out.print("Enter mark 3: ");
        double mark3 = sc.nextDouble();

        Marks obj = new Marks(mark1, mark2, mark3);

        double total = obj.calculateTotal();
        double average = obj.calculateAverage();

        System.out.println("\n MARKS DETAILS");

        System.out.printf("Mark 1 : %.2f%n", mark1);
        System.out.printf("Mark 2 : %.2f%n", mark2);
        System.out.printf("Mark 3 : %.2f%n", mark3);
        System.out.printf("Total : %.2f%n", total);
        System.out.printf("Average : %.2f%n", average);

        sc.close();
    }
}