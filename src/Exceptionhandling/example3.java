package Exceptionhandling;

public class example3
{
	public static void main(String[] args)
	{
		
	int num1=10;
	int num2=2;	
	int div = 0;

	try
	{
		 div=num1/num2;    // 10/2 = 5             //risky code		 
	}
	catch(ArithmeticException s2)
	{
		System.out.println("Arithmetic Exception handled");
	}
	
	System.out.println(div);
	System.out.println("hi");
		
	}
}
