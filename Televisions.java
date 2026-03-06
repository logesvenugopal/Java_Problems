import java.util.Scanner;

class Televisions
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to the TV Showroom");
		System.out.println("What kind of TV looking for You");
		System.out.println("1. SAMSUNG");
		System.out.println("2. LG");
		System.out.println("3. HAIER");
		System.out.println("4. MI");
		
		System.out.println("Tell the Moder which you want");
		String options = sc.nextLine();
		
		if(options.equals("SAMSUNG"))
		{
			System.out.println("Android or SmartTv");
			String tvType = sc.nextLine();
			if(tvType.equals("Android"))
			{
				System.out.println("Enter the Tv size");
				int tvSize = sc.nextInt();
				if(tvSize > 40)
					System.out.println("Price is 35000");
				else if (tvSize>50)
					System.out.println("Price is 55000");
				else if (tvSize>60)
					System.out.println("Price is 75000");
				else
					System.out.println("Price is 25000");
				
			}
			else if(tvType=="SmartTv")
			{
				System.out.println("Enter the Smart Tv size");
				int smartTvSize = sc.nextInt();
				if(smartTvSize > 40)
					System.out.println("Price is 45000");
				else if (smartTvSize>50)
					System.out.println("Price is 65000");
				else if (smartTvSize>60)
					System.out.println("Price is 85000");
				else
					System.out.println("Price is 35000");
			}
			else
			{
				System.out.println("Sorry sir! We Dont have that model");
			}
			
		}
		/*else if(options=="LG")
		{
			System.out.println("LG tv secition");
		}
		else if(options=="HAIER")
		{
			
		}
		else if(options=="MI")
		{
			
		} */
		else
		{
			System.out.println("Sorry sir! We Dont have that model");
		}
	}
}