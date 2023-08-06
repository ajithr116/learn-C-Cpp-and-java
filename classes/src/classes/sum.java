package classes;

import java.util.Scanner;

public class sum 
{
	int num1,num2,sum;
	void getData()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("enter num 1 ");
		num1=sc.nextInt();
		System.out.print("enter num 2 ");
		num2 = sc.nextInt();
		
		sum=num1+num2;	
	}
	void display()
	{
		System.out.print("total = "+sum + "\n");
	}
}
