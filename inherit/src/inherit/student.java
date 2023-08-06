package inherit;


import java.util.Scanner;
public class student 
{

	public static void main(String[] args)
	{
		String name,cls;
		int age;
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("enter name : ");
		name=sc.nextLine();
		System.out.println("enter class : ");
		cls=sc.nextLine();
		System.out.println("enter age : ");
		age=sc.nextInt();
		
		registration reg = new registration(name,cls,age);
		reg.display();
		reg.getdata();
		reg.displayMarks();
		int totalMarks=reg.displayTotalMarks();
		System.out.println("Total : "+totalMarks);
		reg.grade();
		System.out.println(" grade obtained "+ reg.gradeDisplay());
		
	}

}
