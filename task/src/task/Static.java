package task;



public class Static 
{
	static int add(int a,int b)
	{
		return a+b;
	}
	
	int add2(int a,int b)
	{
		return a+b;
	}
	public static void main(String args[])
	{
		System.out.println("add 1 "+add(10,10));
		System.out.println("add 1 "+add2(10,10)); // non static to static is not possible
	}
}
