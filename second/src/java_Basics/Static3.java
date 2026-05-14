package java_Basics;

public class Static3 {

	 String  college="IBMRD";
	static String name="Gaurav";
	int l=30;
	
	public void getresult(int a,String b) {
		
		System.out.println(a+" "+b+" "+college);
	}
	
	public static void meth2(int a,String b) {
		System.out.println(a+" "+b);
	}
	public static void main(String args[]) {
		Static3 s3=new Static3();
		s3.getresult(s3.l,name);
		meth2(s3.l,name);
	}
}
	//Static and Non Static:-

	//#. Static Member we can call directly in same class.
	//#. Non Static Member, We need to call using Object Creation Syntax.

	//#. Object Creation Syntax : ClassName RefName = new ClassName();


	//Note: Static Member can be variables and methods.


	//static ----> static = Brother - Brother (Direct Call)

	//non static ----> non static = Brother - Brother (Direct Call)

