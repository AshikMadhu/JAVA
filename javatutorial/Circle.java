package tutorials;

import java.util.Scanner;

public class Circle {

    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    void display() {

        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.printf("Radius : %.2f%n", radius);
        System.out.printf("Area : %.2f%n", area);
        System.out.printf("Circumference : %.2f%n", circumference);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        Circle obj = new Circle(radius);

        System.out.println("\nCIRCLE DETAILS ");
        obj.display();

        sc.close();
    }
}