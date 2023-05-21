package Methods;

public class sample4 
{
	//3: non-static method call from same class 
		
	public static void main(String[] args)
	{
		//classname objectName = new classname();   --> syntax of object creation
		//sample4 s4=new sample4();
		
		sample4 s4=new sample4();      //step1: create object of same class 
		s4.m5();                       //step2: method call --> objectName.methodname();
		s4.m6();
				
		//1: sample4-> classname  -->  as a datatype of object
		//2: s4  --> objectName  --> to refer/identify  object
		//3: new  --> keyword  --> use to create blank or empty object
		//4: sample4() --> classname()  --> constructor call --> use to copy or load all the members of class into object
	}
	
	
	//non-static regular method
	public void m5() 
	{
		System.out.println("running non-static regular m5 from same class");
	}
	
	//non-static regular method
	public void m6() 
	{
		System.out.println("running non-static regular m6 from same class");
	}

}
