package task;
class vehicle
{
	vehicle(String name)
	{
		System.out.println("name " + name);
	}
}
class car extends vehicle
{
	car(String model) 
	{
		super(model);
	}
	
}
public class Super 
{
	public static void main(String args[])
	{
		car v1 = new car("bmw");
	}
}
