package java_programs;

import java.util.Scanner;

public class largestNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number : ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number : ");
        int b = sc.nextInt();

        int largest = (a > b) ? a : b;

        System.out.println("Largest Number = " + largest);

        sc.close();

    }
}
