package task;

class calculator
{
	int add(int a,int b)
	{
		return a+b;
	}
	int add(int a , int b ,int c)
	{
		return a+b+c;
	}
	float add(float a,float b)
	{
		return a+b;
	}
	double add(double a,double b)
	{
		return a+b;
	}
}


public class Overloading 
{

	public static void main(String[] args) 
	{
		calculator cal = new calculator();
		
		System.out.println("int : "+cal.add(10.12,10.12));
		System.out.println("int : "+cal.add(10,10,10));
		System.out.println("float : "+cal.add(10.12,10.12));
		System.out.println("Double : "+cal.add(10,10));

	}

}
