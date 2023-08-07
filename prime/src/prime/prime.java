package prime;

import java.util.Scanner;

public class prime 
{

	public static void main(String[] args) 
	{
		
		for(int i=0;i<10;i++)
		{
			System.out.print("ennter a number to check prime or not ");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();
			
			if(num<=1)	
			{
				System.out.print("not prime number \n");
			}
			else
			{
				primecheck p = new primecheck();
				p.check(num);
			}
			
		}
		
	}

}
