package javaprogram;

public class MethodOver {
	//Method Overloading in java
	public static int add(int a,int b)
	{
		return a+b;
	}

	public static int add(int a,int b,int c)
	{
		return a+b+c;
		
	}
	public static int add(int a,int b,int c,int d)
	{
		return a+b+c+d;
		
	}
	public static double add(double d1,double d2)
	{
		return d1+d2;
	}
	public static void main(String[] args) {
		System.out.println(add(1,2));
		System.out.println(add(3,6,4));
		System.out.println(add(7,8,9,12));
		System.out.println(add(23.32,92.54));

	}

}
