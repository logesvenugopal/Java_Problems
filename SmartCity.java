import java.util.Scanner;

class SmartCity
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("------ SMART CITY UTILITY MENU ------");
		
		System.out.println("1. Electricity Bill");
		System.out.println("2. Water Bill");
		System.out.println("3. Internet Plan");
		System.out.println("4. Exit");
				
		System.out.println("Enter your choice:");
		
		int options = sc.nextInt();
		//int unit = sc.nextInt();
		
		if(options==1)
		{
			System.out.println("Enter the how many units of yours");
			int unit = sc.nextInt();
			
			if(unit<=100)
			{
				System.out.println("2 Rupees per Unit");
			}
			else if((unit>101)&&(unit<=300))
			{
				System.out.println("3 Rupees per Unit");
			}
			else 
			{
				System.out.println("5 Rupees per Unit");
			}
		}
		else if(options==2)
		{
			System.out.println("Enter Your House Type either Apartment or individual house");
			int houseType = sc.nextInt();
			
			if(houseType==1)
			{
				System.out.println("Monthly Charge is 300");
			}
			else if(houseType==2)
			{
				System.out.println("Monthly charge is 500");
			}
			else
			{
				System.out.println("Not in list");
			}
			
		}
		else if(options==3)
		{
			System.out.println("1. Basic Plan 399");
			System.out.println("2. Standard Plan 699");
			System.out.println("3. Premium Plan 999");
			
			System.out.println("Choose the internet plan based on tarriff");
			int internetPlans = sc.nextInt();
			
			if(internetPlans==1)
			{
				System.out.println("Basic plan starts with 399");
			}
			else if(internetPlans==2)
			{
				System.out.println("Standard plan starts with 699");
			}
			else if(internetPlans==3)
			{
				System.out.println("Premium plan starts with 999");
			}
			else
			{
				System.out.println("Exit");
			}
			
		}
		else
		{
			System.out.println("Exit");
		}
	}
}