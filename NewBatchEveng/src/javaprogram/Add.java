package javaprogram;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter 1st number");
		
		int a=scn.nextInt();
		System.out.println("Enter 2nd number");
		int b=scn.nextInt();
		int sum=a+b;
		System.out.println("The sum of "+a+" and "+b+" is "+sum);

	}

}
