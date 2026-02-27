class JavaSwapExercise
{
	public static void main(String[] args)
	{
		String name="Logeswaran";
		String gender="male";
		String address="Erode";
		long pincode=638009l;
		long phonenumber=1234567890l;
		
		System.out.println("My name is: "+name+", "+"Gender is: "+gender+", "+"Address is: "+address+", "
		+"PIncode: "+pincode+", "+"PhoneNumber is: "+phonenumber);
		
		
		int a =10;
		int b=20;
		System.out.println("Before Swapping: "+a+" and "+b);
		
		int temp=a;
		a=b;
		b=temp;
		System.out.println("after Swapping "+a+" and "+b);
		
		System.out.println("without using Temp value");
		
		int a1 =10;
		int b1=20;
		System.out.println("Before Swapping: "+a1+" and "+b1);
		
		a1=a1+b1;
		b1=a1-b1;
		a1=a1-b1;
		
		System.out.println("after Swapping "+a1+" and "+b1);
		
		
		
		
		
		
		
		
		
	}
}
