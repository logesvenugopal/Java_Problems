import java.util.Scanner;
class LoopingExercise
{
	public static void main(String[] args)
	{
		/* for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		} */
		
		// Write a Java program to print the multiplication table of 5 using do-while loop.
		
		Scanner sc = new Scanner(System.in);
		int b = sc.nextInt();
		int i=1;
		
		do
		{
			System.out.println(i +" x "+b+ "=" +(i*b));
			i++;
		}while(i<=10);
	}
}