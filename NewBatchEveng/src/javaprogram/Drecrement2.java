package javaprogram;

public class Drecrement2 {

	public static void main(String[] args) {
	
		int a=1;//-2
		int b=1;//0
		
		// 0  - 1
		a=--a - b--;
	//     -1  -  -1
		b= a-- - --b;
		System.out.println(a);
		System.out.println(b);

	}

}
