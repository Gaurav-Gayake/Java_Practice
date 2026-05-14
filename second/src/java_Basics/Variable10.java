package java_Basics;

public class Variable10 {

	public static void main (String args[]) {
		int a; // decalring variable
		a=10; // Assigning / intializing value in variable
		System.out.println(a); // 10
		
		char b='c';
		System.out.println(b); // c
		
		String c="Gaurav";
		System.out.println(c);
		
		System.out.println(c.length());
	}
}

//* Need Of DataTypes
//1.It is used store data temporary inside ram
// 2.Data type is something which gives size of memory location

//* limitation of Primitative Datatype
// using primitive datatype we cannot store multiple values
// in continues memory location

//* Memory Allocation
// Local variable gets memory allocation when method is called
// Global variable get memory allocation when object is created
// Static variable gets memory allocation at time of class loading
