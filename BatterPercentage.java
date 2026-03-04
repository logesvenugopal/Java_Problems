class BatterPercentage
{
	public static void main(String[] args)
	{
		int batteryPercentage = 20;
		
		if(batteryPercentage>=80)
		{
			System.out.println("Battery is FUll");
		}
		else if((batteryPercentage>30)&&(batteryPercentage<79))
		{
			System.out.println("Battery is Normal");
		}
		else 
		{
			System.out.println("Low Battery-Charge now");
		}
		
	}
}