package tutorials;

import java.util.Scanner;

public class FibonacciRecursion {

    static int n1 = 0, n2 = 1, n3;

    void printFibonacci(int count) {

        if (count > 0) {

            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;

            System.out.print(" " + n3);

            printFibonacci(count - 1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FibonacciRecursion obj = new FibonacciRecursion();

        System.out.print("Enter the number of terms: ");
        int count = sc.nextInt();

        if (count >= 1) {
            System.out.print("Fibonacci Series:\n");
            System.out.print(n1);

            if (count > 1) {
                System.out.print(" " + n2);
                obj.printFibonacci(count - 2);
            }
        } else {
            System.out.println("Invalid number of terms.");
        }

        sc.close();
    }
}