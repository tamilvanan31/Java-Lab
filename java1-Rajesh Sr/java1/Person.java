class Person
{
	public String name;
	
	public void setname(String s)
	{
		name=s;
	}
	public void getname()
	{
		System.out.println("name is"+ " "+name);
	}
	public static void main(String args[])
	{
		Person obj=new Person();
		obj.name="xyz";
		obj.setname("xyz");
		obj.getname();
	}
}
