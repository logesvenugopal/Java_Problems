class LoopingExercise
{
	public static void main(String[] args)
	{
		/* for(int i=0;i<=10;i++)
		{
			System.out.println(i);
		} */
		
		// Write a Java program to print the multiplication table of 5 using do-while loop.
		int i=1;
		
		do
		{
			System.out.println(i +" x 5 " + "=" +(i*5));
			i++;
		}while(i<=10);
	}
}