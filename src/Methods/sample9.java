package Methods;

public class sample9 
{
	//6: example of method with parameter
	
	public static void main(String[] args)
	{		
		add(10,20);      //initialization    30
		add(50, 60);     //110
		add(100, 200);
		
		System.out.println("------------------");
		
		sample9 s9=new sample9();
		s9.sub(5, 2);
		s9.sub(8, 15);
	}
	
	
	//method with int,int(2 int) parameter
	public static void add(int num1, int num2)    //declaration
	{
		System.out.println(num1+num2);
	}
	
	
	//method with 2 int parameter
	public void sub(int num3, int num4) 
	{
		System.out.println(num3-num4);
	}

}
