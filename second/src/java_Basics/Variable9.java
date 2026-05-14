package java_Basics;

public class Variable9 {

	int b=10; //Global variable
	static int c =20;  // static variable
	
	public static void meth1() {  //Static Method
		int d=25;  // Local variable
		System.out.println(d);
		Variable9 v3=new Variable9(); // can create object in normal static method also
		System.out.println(v3.b); // called non static variable
		System.out.println(c); // called static variable
	}
	
	public void meth2() {  // Non Static method
		int e=30;
		System.out.println(e);
		Variable9 v2=new Variable9(); // created object of class in non static method
		System.out.println(v2.b);
		System.out.println(c); // static variable called no need of object
		meth1(); // static method called
		
	}
	
	public static void main(String args[]) {
		int f=35; // Local Variable
		System.out.println(f); // Printing value of variable f
		
		Variable9 v9=new Variable9();
		
		System.out.println(v9.b); // Global Variable printed using object creation
		System.out.println(c); // static variable printed directly no object required
		v9.meth2();
	}
}
