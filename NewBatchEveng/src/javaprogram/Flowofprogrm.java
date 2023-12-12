package javaprogram;

public class Flowofprogrm {

	public static void m1() {
		System.out.println("m1 method");
	}
	
	public static void m2() {
		m1();
		System.out.println("m2 method");
	}
	
	
	public static void main(String[] args) {
		System.out.println("Main starts");
		m2();
       System.out.println("Main ends");
	}

}
