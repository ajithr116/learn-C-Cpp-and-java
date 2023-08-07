package task;

class person
{
	private String name;
	private int age;
	
	person(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	person()
	{
		this.name="Unknown";
		this.age=0;
	}
	void display()
	{
		System.out.println("name :"+name);
		System.out.println("age : " + age);
	}
}


public class constructor 
{


	public static void main(String[] args) 
	{
		person p = new person();
		p.display();
		
		person p2 = new person("ajith",20);
		p2.display();
	}

}
