package javaprogram;

import java.util.Scanner;

public class sumofditgits {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=scn.nextInt();//1926252=27
		int a=n;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum=sum+r;
			n=n/10;
			
		}

		System.out.println("The sum of digits of "+a+" is "+sum);
	}

}
