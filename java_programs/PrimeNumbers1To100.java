public class PrimeNumbers1To100 {

    public static void main(String[] args) {

        boolean flag;

        System.out.println("Prime Numbers Between 1 and 100:");

        for (int n = 2; n <= 100; n++) {

            flag = true;

            for (int i = 2; i <= n / 2; i++) {

                if (n % i == 0) {

                    flag = false;

                    break;

                }

            }

            if (flag)

                System.out.print(n + " ");

        }

    }

}