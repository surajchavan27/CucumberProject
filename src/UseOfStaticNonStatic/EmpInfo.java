package UseOfStaticNonStatic;

public class EmpInfo 
{
	public static void main(String[] args) {
		
		Emp e1=new Emp();
		e1.empName="rahul";
		e1.empID=101;
		//e1.empCEO="abc";
		Emp.empCEO="abc";
		
		Emp e2=new Emp();
		e2.empName="ganesh";
		e2.empID=102;
		//e2.empCEO="abc";
		Emp.empCEO="abc";
		
		Emp e3=new Emp();
		e3.empName="suresh";
		e3.empID=103;		
		//e3.empCEO="xyz";
		Emp.empCEO="xyz";
		
		
		e1.empDetails();
		e2.empDetails();
		e3.empDetails();		
	}
}
