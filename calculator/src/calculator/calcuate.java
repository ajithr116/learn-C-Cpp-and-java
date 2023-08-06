package calculator;

import java.util.Scanner;

public class calcuate 
{
	float num1,num2;
	float sum;
	
	void getdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number 1");
		num1=sc.nextFloat();
		
		System.out.println("enter number 2");
		num2=sc.nextFloat();
		
	}
	void add()
	{
		sum=num1+num2;
		System.out.println("Total : " + sum);
	}
	void minus()
	{
		sum=num1-num2;
		System.out.println("Total : " + sum);
	}
	void div()
	{
		sum=num1/num2;
		System.out.println("Total : " + sum);
	}
	void multi()
	{
		sum=num1*num2;
		System.out.println("Total : " + sum);
	}
}
