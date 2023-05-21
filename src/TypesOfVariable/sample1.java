package TypesOfVariable;

public class sample1
{	
	//1: example of local & global variable
	
	int a=10;    //global variable
	
	public void m1()
	{
		int c=20;       //local variable
		System.out.println(c);
		System.out.println(a);
	}
	
	public void m2() 
	{
		int d=30;       //local variable
		//System.out.println(c);
		System.out.println(d);
		System.out.println(a);
	}
	
	
	public static void main(String[] args)
	{
		sample1 s1=new sample1();
		s1.m1();
		s1.m2();			
	}

}
