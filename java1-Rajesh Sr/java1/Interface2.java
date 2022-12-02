interface Pet
{
	public void food();
}
class Dog implements Pet
{
	public void food()
	{
		System.out.println("Dog eats dog food");
	}
}
class Interface2
{
	public static void main(String[] ags)
	{
		Pet p=new Dog();
		p.food();
	}
}
