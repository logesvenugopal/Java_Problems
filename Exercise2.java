import java.util.Scanner;

class Exercise2
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the Second number: ");
		int b = sc.nextInt();
		
		int count=0;
		
		for(int i=a; i<=b; i++)
		{
			if(i%5==0)
			{
				System.out.println(i + "    divisible by 5");
				count++;
			}
		}
	}
}