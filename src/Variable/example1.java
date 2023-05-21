package Variable;

public class example1
{
	public static void main(String[] args)
	{		
		//step1: variable declaration
		String sname;      //datatype  variable
		int srollnum;         //4 byte
		float sper;
		char sgrade;
		
		
		//step2: variable initialization
		sname="rahul";      //variableName="variable info"
		srollnum=101;
		sper=75.5f;
		sgrade='A';
		
		//step3: variable usage
		System.out.println("Student name: "+sname);
		System.out.println("Student name= "+sname);     //info reuse
		System.out.println("Student roll num: "+srollnum);
		System.out.println("Student percentage: "+sper+"%");
		System.out.println("Student grade: "+sgrade);
		
	}
}
