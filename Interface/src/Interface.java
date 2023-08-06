// Interface to define the common behavior of shapes
interface Shape 
{
    double calculateArea();
}

// Concrete classes implementing the Shape interface
class Circle implements Shape
{
    private double radius;

    Circle(double radius) 
    {
        this.radius = radius;
    }

    @Override
    public double calculateArea()
    {
        return Math.PI * radius * radius;
    }
}

class Rectangle implements Shape 
{
    private double length;
    private double width;

    Rectangle(double length, double width) 
    {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() 
    {
        return length * width;
    }
}

public class Interface {
    public static void main(String[] args) 
    {
        Shape circle = new Circle(5);
        System.out.println("Circle area: " + circle.calculateArea());

        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle area: " + rectangle.calculateArea());
    }
}
