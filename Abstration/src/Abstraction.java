abstract class hello
{
	abstract void onText(String text);
}

class textScanner
{
	hello obj;
	textScanner(hello obj)
	{
		this.obj=obj;
	}
	void scan()
	{
		obj.onText("scanner");
	}
}

public class Abstraction extends hello
{
	void onText(String text)
	{
		
	}
	Abstraction()
	{
		textScanner t1 = new textScanner(this);
		t1.scan();
	}
	
	
	public static void main(String args[])
	{
		Abstraction a = new Abstraction();
	}
}

