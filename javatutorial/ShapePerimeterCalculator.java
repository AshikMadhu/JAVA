package tutorials;

import java.util.Scanner;

public class ShapePerimeterCalculator {


    double calculatePerimeter(double radius) {
        return 2 * 3.14 * radius;
    }


    int calculatePerimeter(int side) {
        return 4 * side;
    }


    double calculatePerimeter(double side1, double side2, double side3, double side4) {
        return side1 + side2 + side3 + side4;
    }


    int calculatePerimeter(int side1, int side2, int side3) {
        return side1 + side2 + side3;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ShapePerimeterCalculator obj = new ShapePerimeterCalculator();


        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();


        System.out.print("Enter the side of the square: ");
        int side = sc.nextInt();


        System.out.println("Enter the four sides of the trapezium:");
        System.out.print("Side 1: ");
        double side1 = sc.nextDouble();

        System.out.print("Side 2: ");
        double side2 = sc.nextDouble();

        System.out.print("Side 3: ");
        double side3 = sc.nextDouble();

        System.out.print("Side 4: ");
        double side4 = sc.nextDouble();


        System.out.println("Enter the three sides of the triangle:");
        System.out.print("Side 1: ");
        int tSide1 = sc.nextInt();

        System.out.print("Side 2: ");
        int tSide2 = sc.nextInt();

        System.out.print("Side 3: ");
        int tSide3 = sc.nextInt();


        double circlePerimeter = obj.calculatePerimeter(radius);
        int squarePerimeter = obj.calculatePerimeter(side);
        double trapeziumPerimeter = obj.calculatePerimeter(side1, side2, side3, side4);
        int trianglePerimeter = obj.calculatePerimeter(tSide1, tSide2, tSide3);


        System.out.println("\nPERIMETER CALCULATION ");

        System.out.printf("Perimeter of Circle    : %.2f%n", circlePerimeter);
        System.out.println("Perimeter of Square    : " + squarePerimeter);
        System.out.printf("Perimeter of Trapezium : %.2f%n", trapeziumPerimeter);
        System.out.println("Perimeter of Triangle  : " + trianglePerimeter);

        System.out.println("\n DETAILED OUTPUT ");

        System.out.printf("Circle (Radius = %.2f) : %.2f%n",
                radius, circlePerimeter);

        System.out.printf("Square (Side = %d) : %d%n",
                side, squarePerimeter);

        System.out.printf("Trapezium (Sides = %.2f, %.2f, %.2f, %.2f) : %.2f%n",
                side1, side2, side3, side4, trapeziumPerimeter);

        System.out.printf("Triangle (Sides = %d, %d, %d) : %d%n",
                tSide1, tSide2, tSide3, trianglePerimeter);

        sc.close();
    }
}