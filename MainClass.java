class InheritSingle
{
	protected String str;
	InheritSingle()
	{
		str="Java";
    }
}
class SubClass extends InheritSingle
{
	SubClass()
	{
		str=str.concat("world!!!");
	}
	void display()
	{
		System.out.println(str);
	}
}
class MainClass
{
	public static void main(String args[])
	{
		SubClass obj=new SubClass();
		obj.display();
	}
}