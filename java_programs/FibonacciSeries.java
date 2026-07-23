import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Terms: ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;
        int next;

        System.out.print("Fibonacci Series: ");

        for (int i = 1; i <= n; i++) {

            System.out.print(first + " ");

            next = first + second;

            first = second;

            second = next;

        }

        sc.close();

    }

}