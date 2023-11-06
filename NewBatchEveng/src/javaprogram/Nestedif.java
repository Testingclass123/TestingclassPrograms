package javaprogram;

import java.util.Scanner;

public class Nestedif {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter input value");
		int a=scn.nextInt();
		
		if(a%5==0)
		{
			System.out.println(a+" is divisible by 5");
			if(a%2==0)
			{
				System.out.println(a+" is divisible by 2 and 5");
			}
		}

	}

}
