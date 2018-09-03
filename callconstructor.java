class Constructor
{
	Constructor()
	{
		System.out.println("Default Constructor");    
	}
	Constructor(int a)    
	{        
		this();
		System.out.println(a);
 	}
}
class main
{    
	public static void main(String args[])    
	{
		Constructor c=new Constructor(463);
	}
}