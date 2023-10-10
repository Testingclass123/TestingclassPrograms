package javaprogram;

public class Increments12 {

	public static void main(String[] args) {
		int a=1;
		int b=1;
		
		// 2 +  1
		a=++a + b++;
		
		//3  +  3
		b=a++ + ++b;
		System.out.println(a);//3
		System.out.println(b);//3
		
		
		
		int x=1;
		int y=1;
		
		x=x++ + ++y;
		y= ++x + y++;
		
		int p=1;
		int q=1;
		int r=1;
		
		
		 p=++p + q++ + ++r;
		 q= p++ + ++q + r++;
		 r= ++p + ++q + r++;
		
		
		
		
		
		

	}

}
