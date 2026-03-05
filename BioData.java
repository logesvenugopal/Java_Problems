import java.util.Scanner;
 class BioData
 {
	 public static void main(String[] args)
	 {
		Scanner sc = new Scanner(System.in);
		Scanner ab = new Scanner(System.in);
		
		System.out.println("Enter Your Name");
		String name = sc.nextLine();
		
		System.out.println("Enter Your age");
		int age = ab.nextInt();
		
		System.out.println("Enter Your LastName");
		char initial = sc.next().charAt(0);
		
		System.out.println("Enter Your Phone Number");
		long phoneNumber = ab.nextLong();
		
		System.out.println(name+" "+initial+" "+age+" "+phoneNumber);
		
	 }
 }