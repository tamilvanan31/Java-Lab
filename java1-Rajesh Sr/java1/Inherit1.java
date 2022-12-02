class Vehicle
{
	int speed;
	void description()
	{	
		System.out.println("this vechile goes in "+speed+" speed");
	}
}
class Car extends Vehicle 
{
	void description()
	{
		System.out.println("This vechile goes in "+speed+" speed");
	}
	void getspeed(int s)
	{
		speed=s;
	}
}
class Inherit1
{
	public static void main(String[] args)
	{
		Car c=new Car();
		c.getspeed(70);
		c.description();
	}
}	
