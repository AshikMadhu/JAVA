package tutorials;

import java.util.Scanner;

public class FactorialRecursion {

    int factorial(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        FactorialRecursion obj = new FactorialRecursion();

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int result = obj.factorial(number);
            System.out.println("Factorial of " + number + " = " + result);
        }

        sc.close();
    }
}