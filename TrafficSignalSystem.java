class TrafficSignalSystem
{
	public static void main(String[] args)
	{
		char signalColor = 'G';
		
		if(signalColor=='R')
		{
			System.out.println("Stop the Vehicle befor white line");
		}
		else if(signalColor=='Y')
		{
			System.out.println("Ready to Go");
		}
		else if(signalColor=='G')
		{
			System.out.println("Go");
		}
		else
		{
			System.out.println("Wait until release signal");
			
			
		}
	}
}