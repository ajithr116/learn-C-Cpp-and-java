package inherit;

public class grades 
{
	char grade;
	char grade(int total)
	{
		if(total>=90 && total<=100)
		{
			grade='A';
		}
		else if(total>70 && total<=80)
		{
			grade='B';
		}
		else if(total>60 && total<=70)
		{
			grade='C';
		}
		else if(total>50 && total<=60)
		{
			grade='D';
		}
		else if(total>40 && total<=50)
		{
			grade='E';
		}
		else
		{
			grade='F';
		}
		return grade;
	}
}
