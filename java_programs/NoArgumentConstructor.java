package HELLO;

public class NoArgumentConstructor {

    int number;

    NoArgumentConstructor() {
        number = 100;
    }

    public static void main(String[] args) {

        NoArgumentConstructor obj = new NoArgumentConstructor();

        System.out.println("Number = " + obj.number);
    }
}