import java.util.Scanner;

class AnimalSounds
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Animal name");
		String a = sc.nextLine();
		
		switch(a)
		{
			case "Dog":
			System.out.println("Dog says wow wow");
			break;
			
			case "Cat":
			System.out.println("Cat says meow meow");
			break;
			
			case "Cow":
			System.out.println("Cow says Moo");
			break;
			
			default:
			System.out.println("Exit");
		}
	}
}