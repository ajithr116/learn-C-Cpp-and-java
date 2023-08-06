package inherit;

public class registration extends marks
{
	
	String name,cls;
	int age;
	public registration(String name,String cls,int age) 
	{
		this.name=name;
		this.cls=cls;
		this.age=age;
	}
	void display()
	{
		System.out.println("Name : " + name);
		System.out.println("Class : " + cls);
		System.out.println("age : " + age);
	}

}
