//Using threads, lets creating racing game 5 different bikes,race,middle petrol bunk,finish

public class Ass_1
{
	public static void main(String arg[])
	{
			Bike1 B1=new Bike1();
			Bike2 B2=new Bike2();
			Bike3 B3=new Bike3();
			Bike4 B4=new Bike4();
			Bike5 B5=new Bike5();
			
			B1.start();
			B2.start();
			B3.start();
			B4.start();
			B5.start();
	}
}
