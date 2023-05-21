package Methods;

public class sample5 
{
	//4: non-static method call from diff class
	
	public static void main(String[] args) 
	{		
		sample6 s6=new sample6();       //step1: create object of diff class
		s6.m7();                       // step2: method call --> diffclassObjectName.methodname();
		s6.m8();
		s6.m8();		
	}
}
