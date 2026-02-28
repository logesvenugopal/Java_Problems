class OperatorsExercise
{
	public static void main(String [] args)
	{
		int a= 100;
		int b= 200;
		//Addition 
		int c=a+b;
		System.out.println("the addition symbol :" + c);
		
		// Subtraction
		int d=c-a;
		System.out.println("the subtraction symbol :"+ d);
		
		//Multiplication
		int e=d*2;
		System.out.println("the multi symbol :"+ e);
		
		//Division
		int f = e/10;
		System.out.println("the division symbol :"+ f);
		
		//Modulus
		int g = f%10;
		System.out.println("the modulus symbol :"+ g);
		
		//Increment
		int h=g++;
		System.out.println("the increment symbol :"+ g);
		
        // Decrement
		int k=h--;
		System.out.println("the increment symbol :"+ k);
		
		//Relational operator
		int x1=10;
		int y1=7;
		boolean result1 = x1<=y1;
		System.out.println(result1);
		
		//Logical Operators
		int x=25;
		int y=18;
		
		boolean result2=((x>y)&&(y<x))&&((x<y)&&(y<x));
		boolean result=((false)||(x<y))&&((x>y)&&(y<x));
		System.out.println(result2);
		boolean res=!((true)&&(false));
		System.out.println(res);
		
		System.out.println("Google form Exercise question number");
		
		int num1=10;
		int num2=20;
		System.out.println(num1>num2);
		System.out.println(num1<num2);
		System.out.println(num1>=num2);
		System.out.println(num1<=num2);
		System.out.println(num1==num2);
		System.out.println(num1!=num2);
		
				
	}
	
	
	
	
}