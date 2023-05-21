package TypesOfVariable;

public class sample4 
{
	int c=30;     //non-static global(instance) variable
	
	
	public static void main(String[] args)
	{
		//non-static global variable call from same class
		sample4 s4=new sample4();                //step1: create object of same/current class
		System.out.println(s4.c);                //step2: variable call --> objectName.variable		
	
		
		//non-static global variable call from diff class
		sample5 s5=new sample5();
		System.out.println(s5.d);
	}
	
	
	public static void m3() 
	{
		sample4 s5=new sample4();
		System.out.println(s5.c);
		
	}
	
	public void name()
	{
		System.out.println(c);
	}
	
	

}
