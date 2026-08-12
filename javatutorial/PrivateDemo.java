package tutorials;

class Car {

    private String model = "Toyota";

    void showModel() {
        System.out.println("Car Model: " + model);
    }
}

public class PrivateDemo {

    public static void main(String[] args) {

        Car obj = new Car();

        obj.showModel();
    }
}