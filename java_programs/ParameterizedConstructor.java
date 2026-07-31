package HELLO;

public class ParameterizedConstructor {

    int number;

    ParameterizedConstructor(int n) {
        number = n;
    }

    public static void main(String[] args) {

        ParameterizedConstructor obj = new ParameterizedConstructor(500);

        System.out.println("Number = " + obj.number);
    }
}