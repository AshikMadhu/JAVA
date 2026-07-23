import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int n = sc.nextInt();

        boolean flag = true;

        if (n <= 1) {

            flag = false;

        } else {

            for (int i = 2; i <= n / 2; i++) {

                if (n % i == 0) {

                    flag = false;
                    break;

                }

            }

        }

        if (flag)

            System.out.println(n + " is a Prime Number");

        else

            System.out.println(n + " is Not a Prime Number");

        sc.close();

    }

}