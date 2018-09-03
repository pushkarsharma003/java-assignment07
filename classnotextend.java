final class myclass
{
	final void fun() 
	{
		System.out.println("This class cannot be extended furthur");
		System.out.println("Also, function can't be override due to final ");
	}
}
class main1
{
	public static void main(String args[])
	{
		myclass obj=new myclass();
		obj.fun();
	}
}