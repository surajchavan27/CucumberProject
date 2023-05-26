package Generalization;

public class TestGeneralization 
{
	public static void main(String[] args) 
	{
		System.out.println("---Features of Jio SimCard----");
		Jio j=new Jio();
		j.sms();
		j.ac();
		j.data();
		j.newfeatureA();
		
		System.out.println("---Features of Airtel SimCard----");
		Airtel a=new Airtel();
		a.sms();
		a.ac();
		a.data();
		a.newfeatureB();
		
		System.out.println("---Features of VI SimCard----");
		VI v=new VI();
		v.sms();
		v.ac();
		v.data();
		v.newfeatureC();
	}

}
