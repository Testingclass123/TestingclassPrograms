package javaprogram;

import java.util.Scanner;

public class ConditionalStatement {

	public static void main(String[] args) {
		//1.If condition 
		//2.If else condition
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter input value");
		int a=scn.nextInt();
		if(a%2==0) {
			System.out.println(a+" is an even number");
		}else {
			System.out.println(a+" is an odd number");
		}

	}

}
