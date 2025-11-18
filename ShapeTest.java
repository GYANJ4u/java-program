// Define the interface
interface Shape {
    double area();
}

// Implementing Circle class
class Circle implements Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement area method
    public double area() {
        return Math.PI * radius * radius;
    }
}

// Implementing Rectangle class
class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implement area method
    public double area() {
        return length * width;
    }
}

// Main class to test the implementation
public class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape rectangle = new Rectangle(4.0, 6.0);

        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}
