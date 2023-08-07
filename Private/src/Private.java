import java.util.Scanner;

class bank
{
	private String name;
	private int password;
	private float balance=1000;
	
	bank(String name,int password)
	{
		this.name= name;
		this.password=password;
	}
	private int getdata()
	{
		int pass,chk;
		String nme;
		
		System.out.println("enter name ");
		Scanner sc = new Scanner(System.in);
		nme=sc.nextLine();
		System.out.println("enter password ");
		pass=sc.nextInt();

		chk=check(nme,pass);
		return chk;
		
	}
	private void displaybalance()
	{
		System.out.println("balance : "+balance);
	}
	private String withdraw()
	{
		float money;
		String query;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter money to withdraw : ");
		money=sc.nextFloat();
		
		if(money<balance)
		{
			balance=balance-money;
			query="withdraw success";
			return query;
		}
		else
		{
			query="insufficient balance";
			return query;
		}
	}
	private void deposite()
	{
		int money;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter amount to deposite ");
		money=sc.nextInt();
		
		balance=balance+money;
		System.out.println("deposite success ");

	}
	int check(String nme,int pass)
	{
		if(pass==password && name.equals(nme))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	
	protected int getData()
	{
		return getdata();
	}
	protected void displayBalance()
	{
		displaybalance();
	}
	protected String withDraw()
	{
		return withdraw();
	}
	protected void Deposite()
	{
		deposite();
	}
}

public class Private 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int password,choice,check,flag=0;
		
		
		System.out.println("CREATE ACCONT ");
		System.out.println("Enter name ");
		name=sc.nextLine();
		System.out.println("Enter password ");
		password=sc.nextInt();
		
		bank b1 = new bank(name,password);
		
		
		for(int i=0;i<5;i++)
		{
			if(flag==1)
			{
				System.out.println("2) balance \t 3) withdraw \t4) deposite ");
			}
			else
			{
				System.out.println("1)Login\t 2) balance \t 3) withdraw \t4) deposite ");
			}
			System.out.println("enter choice : ");
			choice=sc.nextInt();
			switch(choice)
				{
				case 1:
				{
					int j;
					for(j=0;j<3;j++)
					{
						check=b1.getData();	
						if(check==1)
						{
							System.out.println("Success ");
							flag=1;
							break;
						}
						else
						{
							if(j==2)
							{
								System.out.println("To many attempt . please try again later ");
								System.exit(0);
							}
							else
							{
								System.out.println("Failed login ");
							}
						}
					}
					break;
				}
				case 2:
				{
					if(flag==0)
					{
						System.out.println("You have not logged in ");
						break;
					}
					else
					{
						b1.displayBalance();
					}
					break;
				}
				case 3:
				{
					if(flag==0)
					{
						System.out.println("You have not logged in ");
						break;
					}
					else
					{
						System.out.println(b1.withDraw());
					}
					break;
				}
				case 4:
				{
					if(flag==0)
					{
						System.out.println("You have not logged in ");
						break;
					}
					else
					{
						b1.Deposite();
					}
					break;
				}
				default:
					System.out.println("invalid option ");
					break;
			}
		}
		
	}
}
