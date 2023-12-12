package javaprogram;

import java.util.Scanner;

public class Armstrongnumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=scn.nextInt();//153 =1*1*1+5*5*5+3*3*3
        int a=n;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			sum=sum+r*r*r;
			n=n/10;
		}
		if(a==sum)
		{
			System.out.println(a+" is a armstrong number");
		}else {
			System.out.println(a+" is not a armstrong number");
		}
	}

}
