package prime;

public class primecheck 
{
	void check(int n)
	{
		int m,i,flag=0;

		
		for(i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==1)
		{
			System.out.print("not prime number \n\n");
		}
		else
		{
			System.out.print("prime number \n\n");

		}
	}
}
