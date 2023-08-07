package task;

class Animal
{
	void makeSound()
	{
		System.out.println("animal sound ");
	}
}

class Cat extends Animal
{
	void makeSound()
	{
		System.out.println("woof... ");
	}
}

class Dog extends Animal
{
	void makeSound()
	{
		System.out.println("meow... ");
	}
}
public class polymorphism 
{

	public static void main(String args[])
	{
		Animal ani1 = new Cat();
		Animal ani2 = new Dog();
		Animal ani3 = new Animal();

		
		ani1.makeSound();
		ani2.makeSound();
		ani3.makeSound();
	}
}
