package tutorials;
import java.util.Scanner;
import java.util.Vector;

public class VectorSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Vector<String> items = new Vector<String>();

        items.add("Pen");
        items.add("Notebook");
        items.add("Eraser");
        items.add("Marker");

        System.out.print("Enter an item name: ");
        String item = sc.nextLine();

        if (items.contains(item)) {
            System.out.println("Item found");
        } else {
            System.out.println("Item not found");
        }

        sc.close();
    }
}