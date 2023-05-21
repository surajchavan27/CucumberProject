package Methods;

public class sample7 
{	
	//5: example of method without/zero parameter
	
	public static void main(String[] args)
	{
		//1: static regular method call from same class
		m1();
				
		//2: static regular method call from diff class
		sample8.m2();
		
		
		//3: non-static regular method call from same class
		sample7 s7=new sample7();
		s7.m3();
		
		
		//4: non-static regular method call from diff class
		sample8 s8=new sample8();
		s8.m4();
	}
		
	 //method without/zero parameter
	public static void m1()
	{
		System.out.println("running static regular method m1 from same class");
	}
	
	//method without/zero parameter
	public void m3()
	{
		System.out.println("running non-static regular method m3 from same class");
	}
	
	
	
}
