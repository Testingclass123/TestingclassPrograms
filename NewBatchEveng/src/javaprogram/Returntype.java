package javaprogram;

public class Returntype {

	

	public static  int addition(int a,int b) {
	//	System.out.println("Addition function");
		int sum=a+b;
		 return sum;
	}
	
	public static void main(String[] args) {
		int sum=addition(43,76);
		System.out.println("Sum="+sum);

	}

}
