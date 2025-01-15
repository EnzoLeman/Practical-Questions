package Mathematics;

import java.util.Scanner;

public class Rectangle {
    // Attributes
    float length = 1;
    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        if (length > 0.0 && length < 20.0) {
            this.length = length; 
        } else {
            System.out.println("Length is not  larger than 0.0 and less than 20.0!!");
        }
    }
    float width = 1;

    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        if (width > 0.0 && width < 20.0) {
            this.width = width;
        } else {
            System.out.println("Width is not  larger than 0.0 and less than 20.0!!");
        }
    }

    // Methods
    public float Perimeter(float length, float width){
        return 2*(length+width);
    }
    public float Area(float length, float width){
        return length*width;
    }

    // Main Method
    public static void main(String[] args) {
        // Create an object
        Rectangle rectangle = new Rectangle();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Length: ");
        float length = scanner.nextFloat();
        rectangle.setLength(length);

        System.out.print("Enter Width: ");
        float width = scanner.nextFloat();
        rectangle.setWidth(width);

        System.out.println("------------------");
        System.out.printf("Perimeter: %.2f%n",rectangle.Perimeter(length, width));
        System.out.printf("Area: %.2f%n",rectangle.Area(length, width));
        System.out.println("------------------");
        scanner.close();

       
    }
}
