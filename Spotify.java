import java.util.Scanner;

class Spotify
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("SELECT YOUR OPTION, THE OPTIONS ARE");
		System.out.println("1. A.R. RAHMAN.");
		System.out.println("2. ANIRUDH");
		System.out.println("3. HARISH JEYARAJ");
		System.out.println("4. ILLAIYARAJA");
		System.out.println("5. U1");
		
		int options = sc.nextInt();
		
		if(options==1)
		{
			System.out.println("SELECT YOUR OPTION, ARE FROM A R RAHMAN PLAYLIST");
			System.out.println("1. MELODY");
			System.out.println("2. KUTHU");
			System.out.println("3. MOTIVATIONAL");
			System.out.println("4. SAD");
			
			int songType = sc.nextInt();
			
			if(songType==1)
			{
				System.out.println("Netru illadha Matram");
				System.out.println("Enna Solla Pogirai");
				System.out.println("Ennavale Adi Ennavale");
				System.out.println("Malargale Malargale");
			}
			else if(songType==2)
			{
				System.out.println("Thaiya Thaiya");
				System.out.println("Mukkala Mukkabala");
				System.out.println("Urvashi Urvashi");
				System.out.println("Aathichudi");
			}
			else if(songType==3)
			{
				System.out.println("Vande Mataram");
				System.out.println("Oruvan Oruvan mudhalli");
				System.out.println("Shakthi kodu");
				System.out.println("Kappal Yeari Poyachu");
			}
			else if(songType==4)
			{
				System.out.println("Poongatrile");
				System.out.println("Marudaani");
				System.out.println("Minnalea En vazhvin");
				System.out.println("Rasathi");
			}
			else
			{
				System.out.println("Exit");
			}
		}
		else if(options==2)
		{
			System.out.println("SELECT YOUR OPTION, ARE FROM ANIRUDH PLAYLIST");
			System.out.println("1. MELODY");
			System.out.println("2. KUTHU");
			System.out.println("3. MOTIVATIONAL");
			System.out.println("4. SAD");
			
			int songTypeAnirudh = sc.nextInt();
			
			if(songTypeAnirudh==1)
			{
				System.out.println("Neeyum Nanum Anbe");
				System.out.println("Velicha Poove");
				System.out.println("Po Indru Neeyaga");
				System.out.println("Nee partha vizhigal");
			}
			else if(songTypeAnirudh==2)
			{
				System.out.println("Vaathi Raid");
				System.out.println("Naa Ready");
				System.out.println("Badass");
				System.out.println("Vandha Edam");
			}
			else if(songTypeAnirudh==3)
			{
				System.out.println("Velai Illa pattathari");
				System.out.println("Boomi Enna Suthudhe");
				System.out.println("Ethir Neechal");
				System.out.println("Surviva");
			}
			else if(songTypeAnirudh==4)
			{
				System.out.println("Porkanda Singam");
				System.out.println("Kanave Kanave");
				System.out.println("Kannaana Kanne");
				System.out.println("Jodi Nilave");
			}
			else
			{
				System.out.println("Exit");
			}
		}
		else if(options==3)
		{
			System.out.println("SELECT YOUR OPTION, ARE FROM HARRIS PLAYLIST");
			System.out.println("1. MELODY");
			System.out.println("2. KUTHU");
			System.out.println("3. MOTIVATIONAL");
			System.out.println("4. SAD");
			
			int songTypeHarris = sc.nextInt();
			
			if(songTypeHarris==1)
			{
				System.out.println("Unnale");
				System.out.println("Annul Maele");
				System.out.println("Yedho Ondru");
				System.out.println("Vaseegara");
			}
			else if(songTypeHarris==2)
			{
				System.out.println("Tirunelveli Halwa Da");
				System.out.println("Aradi katre");
				System.out.println("Soda Bottle");
				System.out.println("Aruva Meesai");
			}
			else if(songTypeHarris==3)
			{
				System.out.println("Velai Illa pattathari");
				System.out.println("Boomi Enna Suthudhe");
				System.out.println("Ethir Neechal");
				System.out.println("Surviva");
			}
			
			else
			{
				System.out.println("Exit");
			}
		}
		else if(options==4)
		{
			System.out.println("SELECT YOUR OPTION, ARE FROM ILAYARAJA PLAYLIST");
			System.out.println("1. MELODY");
			System.out.println("2. KUTHU");
			System.out.println("3. MOTIVATIONAL");
			System.out.println("4. SAD");
			
			int songTypeIlayaraja = sc.nextInt();
			
			if(songTypeIlayaraja==1)
			{
				System.out.println("Oru kili uruguthu");
				System.out.println("Kuzhaloodhum kannanukku");
				System.out.println("Ennai thottu");
				System.out.println("Raja Raja cholan");
			}
			else if(songTypeIlayaraja==2)
			{
				System.out.println("Ooruvittu ooruvanthu");
				System.out.println("Nooru varusham");
				System.out.println("Aasai Nooruvagai");
				System.out.println("Aasai Athigam vachu");
			}
			else if(songTypeIlayaraja==3)
			{
				System.out.println("Kanne Kalaimane");
				System.out.println("Thene thenpaandi Neeye");
				System.out.println("Paadi Parantha Killi");
				System.out.println("Nilave Vaa");
			}
			
			else
			{
				System.out.println("Exit");
			}
		}
		else if(options==5)
		{
			
		}
		else
		{
			System.out.println("exit");
		}
		
	}
}