package javaprogram;

public class Staticnonmethd {

	static String a;
	int s;
	
	//static method
	public static void m1(Staticnonmethd s1) {
		System.out.println(a);
		
		System.out.println(s1.s);
	}
	
	//Non static method
	public  void m2() {
		System.out.println(s);
		System.out.println("m2 method");
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		
	 Staticnonmethd s=new Staticnonmethd(); 
	 a="abcd";
	 Staticnonmethd.m1(s);
	 s.m2();
		 

	}

}
