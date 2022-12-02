class Animal
{
	void description()
	{
		System.out.println("Animal class");
	}
}
class Dog extends Animal
{
	void description()
	{
		System.out.println("Dog class");
	}
}
class Overload
{
	public static void main(String[] args)
	{
		Dog d=new Dog();
		d.description();
	}
}
