package abstractVsInterface;

//Interface to define the common behavior of shapes
interface Shape 
{
 double calculateArea();
}

//Abstract class to provide common functionality for shapes
abstract class AbstractShape implements Shape 
{
	 String name;
	
	 AbstractShape(String name) 
	 {
	     this.name = name;
	 }
	
	 void display() {
	     System.out.println("Name: " + name);
	 }
}

//Concrete classes implementing the Shape interface and extending the AbstractShape class
class Circle extends AbstractShape
{
	 private double radius;
	
	 Circle(String name, double radius)
	 {
	     super(name);
	     this.radius = radius;
	 }
	
	 public double calculateArea() 
	 {
	     return Math.PI * radius * radius;
	 }
	}
	
class Rectangle extends AbstractShape 
{
 private double length;
 private double width;

 Rectangle(String name, double length, double width)
 {
     super(name);
     this.length = length;
     this.width = width;
 }

 public double calculateArea()
 {
     return length * width;
 }
}

public class Main {
 public static void main(String[] args)
 {
     Circle circle = new Circle("Circle", 5);
     circle.display();
     System.out.println("Circle area: " + circle.calculateArea());

     Rectangle rectangle = new Rectangle("Rectangle", 4, 6);
     rectangle.display();
     System.out.println("Rectangle area: " + rectangle.calculateArea());
 }
}
