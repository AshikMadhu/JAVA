package tutorials;

import java.util.Scanner;

public class SumOfDigitsRecursion {

    int sumOfDigits(int n) {

        if (n == 0) {
            return 0;
        }

        return (n % 10) + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SumOfDigitsRecursion obj = new SumOfDigitsRecursion();

        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            int sum = obj.sumOfDigits(n);
            System.out.println("Sum of digits is: " + sum);
        }

        sc.close();
    }
}