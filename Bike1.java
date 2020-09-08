//BIKE-1
public class Bike1 extends Thread
{
	public void run()
	{	
		for(int i=0;i<=30;i++)
		{
			if(i==7 || i==14 || i==21 || i==28)
			{
				System.out.println("Bike1 refilling gas");
			}
			else if(i==30)
			{
				System.out.println("Bike1 completed the race");
			}
			else
			{
				System.out.println("Bike1 completed " + i + " miles");
			}
		}
	}
}

//BIKE-2
class Bike2 extends Thread
{
	public void run()
	{	
		for(int i=0;i<=30;i++)
		{
			if(i==11 || i==22)
			{
				System.out.println("Bike2 refilling gas");
			}
			else if(i==30)
			{
				System.out.println("Bike2 completed the race");
			}
			else
			{
				System.out.println("Bike2 completed " + i + " miles");
			}
		}
	}
}

//BIKE3
class Bike3 extends Thread
{
	public void run()
	{	
		for(int i=0;i<=30;i++)
		{
			if(i==7 || i==14 || i==21 || i==28)
			{
				System.out.println("Bike3 refilling gas");
			}
			else if(i==30)
			{
				System.out.println("Bike3 completed the race");
			}
			else
			{
				System.out.println("Bike3 completed " + i + " miles");
			}
		}
	}
}


//BIKE4
class Bike4 extends Thread
{
	public void run()
	{	
		for(int i=0;i<=30;i++)
		{
			if(i==12 || i==24)
			{
				System.out.println("Bike4 refilling gas");
			}
			else if(i==30)
			{
				System.out.println("Bike4 completed the race");
			}
			else
			{
				System.out.println("Bike4 completed " + i + " miles");
			}
		}
	}
}

//BIKE5
class Bike5 extends Thread
{
	public void run()
	{	
		for(int i=0;i<=30;i++)
		{
			if(i==7 || i==14 || i==21 || i==28)
			{
				System.out.println("Bike5 refilling gas");
			}
			else if(i==30)
			{
				System.out.println("Bike5 completed the race");
			}
			else
			{
				System.out.println("Bike5 completed " + i + " miles");
			}
		}
	}
}