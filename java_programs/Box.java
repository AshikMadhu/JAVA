package HELLO;

public class Box {

    double height;
    double width;
    double depth;

    public double calculateVolume() {
        return height * width * depth;
    }

    public static void main(String[] args) {

        Box myBox = new Box();
        
        myBox.height = 10;
        myBox.width = 5;
        myBox.depth = 4;
        
        double volume = myBox.calculateVolume();
        
        System.out.println("Volume: " + volume);
    }
}