package javaprogram;

import java.util.Scanner;

public class factorial {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=scn.nextInt();//6
		int fact=1;//720
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
       System.out.println("The factorial of "+n+" is "+fact);
	}

}
