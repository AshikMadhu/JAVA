package tutorials;

class Animal {

    String species = "Mammal";
}

public class DefaultDemo {

    public static void main(String[] args) {

        Animal obj = new Animal();

        System.out.println("Species: " + obj.species);
    }
}