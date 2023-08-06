package allinone;

interface MyInterface 
{
 void printMessage();
}

abstract class MyAbstractClass 
{
 abstract void abstractMethod();

 void concreteMethod() 
 {
     System.out.println("This is a concrete method in the abstract class.");
 }
}

class MyClass extends MyAbstractClass implements MyInterface
{
	 private int privateVar;
	 protected int protectedVar;
	 public int publicVar;
	
	 MyClass(int privateVar, int protectedVar, int publicVar)
	 {
	     this.privateVar = privateVar;
	     this.protectedVar = protectedVar;
	     this.publicVar = publicVar;
	 }
	
	 // Method overriding
	 @Override
	 void abstractMethod()
	 {
	     System.out.println("This is the implementation of the abstract method.");
	 }
	
	 public void printMessage()
	 {
	     System.out.println("Printing a message.");
	 }
	
	 // Method overloading
	 void printMessage(String message) 
	 {
	     System.out.println("Printing a message: " + message);
	 }
}

public class Main 
{
 public static void main(String[] args) 
 {
     MyClass obj = new MyClass(10, 20, 30);
     obj.abstractMethod();
     obj.printMessage();
     obj.printMessage("Hello, world!");
 }
}
