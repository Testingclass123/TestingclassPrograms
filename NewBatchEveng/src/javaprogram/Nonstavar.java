package javaprogram;

public class Nonstavar {

	//Non static variable
	int a=272829;
	String s;
	
	public static void main(String[] args) {
		//Create an Object
		//Object =state and behaviour
		//How to create Object
		//Syntax
		Nonstavar ns=new Nonstavar();
		
		
		System.out.println(ns.a);
		System.out.println(ns.s);
		
		Nonstavar ns1=new Nonstavar();
		ns1.a=272;
		ns1.s="Abcd";
		System.out.println(ns1.a);
		System.out.println(new Nonstavar().a=2342);
		
		
		
		

	}

}
