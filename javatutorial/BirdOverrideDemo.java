package tutorials;

class BirdType {

    void fly() {
        System.out.println("Bird can fly.");
    }
}

class SparrowType extends BirdType {

    void fly() {
        System.out.println("Sparrow flies short distances.");
    }
}

class EagleType extends BirdType {

    void fly() {
        System.out.println("Eagle soars high in the sky.");
    }
}

public class BirdOverrideDemo {

    public static void main(String[] args) {

        BirdType[] birds = {
            new BirdType(),
            new SparrowType(),
            new EagleType()
        };

        for (BirdType bird : birds) {
            bird.fly();
        }
    }
}