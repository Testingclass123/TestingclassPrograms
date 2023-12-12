package javaprogram;

import java.util.Scanner;

public class Pallindromenumber {

	public static void main(String[] args) {
		//Pallindromenumber=1331,121,141,123454321,1234321
		
		
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=scn.nextInt();//1
		int a=n;
		int sum=0;//1234321
		while(n>0)
		{
			int r=n%10;
			sum=sum*10+r;
			n=n/10;
			
		}
		
		if(a==sum) {
			System.out.println(a+" is a pallindrome number");
		}else {
			System.out.println(a+" is not a pallindrome number");
		}
		
	}

}
