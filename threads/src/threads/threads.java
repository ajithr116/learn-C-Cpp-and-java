package threads;

/*
public class threads extends Thread
{

	public static int amt=0;
	
	public static void main (String[] args) 
	{
		threads t = new threads();
		t.start();
		while(t.isAlive())
		{
			System.out.println("Waiting...");
		}
		System.out.println("main..." + amt);
		amt++;
		System.out.println("main 2..." + amt);
	}
	public void run()
	{
		amt++;
	}
}
*/

class sampleThreads extends Thread
{
	int a=2;
	sampleThreads(int a)
	{
		this.a=a;
	}
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("count "+i+" thread "+a);
			try 
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				System.out.println("Exception "+e);
				e.printStackTrace();
			}
		}
	}
}

public class threads 
{
	public static void main(String args[])
	{
		sampleThreads t1 =new sampleThreads(1);
		sampleThreads t2 =new sampleThreads(2);
		sampleThreads t3 =new sampleThreads(3);
		
		t1.start();
		t2.start();
		t3.start();
	}
}