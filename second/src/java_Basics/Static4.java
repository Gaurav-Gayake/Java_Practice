package java_Basics;

public class Static4 {

	static int z=5; //static variable
	int y=1;  // global variable
	public static void meth1() {
		z=10;
		System.out.println(z);
	}
	public void meth2() {
		z=20;
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		

		System.out.println(z);
		meth1();
		System.out.println(z);
		
		Static4 st=new Static4();
		st.meth2();
	}

}
