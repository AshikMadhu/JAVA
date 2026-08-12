package tutorials;

import java.util.Vector;

public class FruitVector {

    public static void main(String[] args) {

        Vector<String> fruits = new Vector<String>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");
        fruits.add("Grapes");

        System.out.println("Fruits in the Vector:");

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}