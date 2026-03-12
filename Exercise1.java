import java.util.Scanner;

class Exercise1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first Number");
		
		int a = sc. nextInt();
		
		System.out.println("Enter the Second Number");
		
		int b= sc.nextInt();
		
		int count=0;
		int count1=0;
		
		int sum =0;
		int sum1=0;
		
		for(int i=a;i<=b; i++)
		{
			if(i%2==0)
			{
				System.out.println(i+"  even number");
				sum=i+sum;
				
				count++;
			}
			else 
			{
				System.out.println(i+"  odd numbr");
				sum1=i+sum1;
				count1++;
			}
		}
		
		System.out.println("odd number count: "+count);
		System.out.println("even number count: "+count1);
		
		System.out.println("odd number total value: "+sum);
		System.out.println("even number total value: "+sum1);
	}
}