import java.*;
class Human
{
	int height=150;
	void display()
	{
		System.out.println("Height :"+height);
	}
}
class Male extends Human
{
	void set()
	{
		height=170;
	}
}
class Female extends Human
{
	void set()
	{
		height=130;
	}
}
class DisInherit
{
	public static void main(String[] args)
	{
		Male m=new Male();
		Female f=new Female();
		Human h=new Human();
		m.set();
		m.display();
		f.set();
		f.display();
		h.display();
	}
}
