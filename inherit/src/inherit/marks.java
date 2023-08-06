package inherit;

import java.util.Scanner;

public class marks extends grades
{
	int m1,m2,m3,total;
	char grade;
	void getdata()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter mark 1 , 2 and 3 : ");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();	
	}
	void displayMarks()
	{
		System.out.println("mark 1 : "+m1);
		System.out.println("mark 2 : "+m2);
		System.out.println("mark 3 : "+m3);

	}
	int displayTotalMarks()
	{
		total=m1+m2+m3;
		return total;
	}
	void grade()
	{
		grade=grade(total);
	}
	char gradeDisplay()
	{
		return grade;
	}
}
