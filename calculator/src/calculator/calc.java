package calculator;

import java.util.Scanner;

public class calc
{

	public static void main(String[] args)
	{
		int choice;
		Scanner sc = new Scanner(System.in);
		calcuate c = new calcuate();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("1) add\n2) minus \n3) div \n4) multi \n");
			System.out.println("enter your choice : ");
			choice = sc.nextInt();
			
			switch(choice)
			{
			case 1:
				c.getdata();
				c.add();
				break;
			case 2:
				c.getdata();
				c.minus();
				break;
			case 3:
				c.getdata();
				c.div();
				break;
			case 4:
				c.getdata();
				c.multi();
				break;
			default:
				System.out.println("invalid choice \n");
			}
		}
		
		
	}

}
