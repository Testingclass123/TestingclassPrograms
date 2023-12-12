package javaprogram;

import java.util.Scanner;

public class Strongnumber {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter your number");
		int n=scn.nextInt();//14
		int a=n;
		int sum=0;
		while(n>0) {
			int r=n%10;
			int p=1;
			int q=1;
			      while(p<=r)
			      {
			    	  q=q*p;
			    	  p++;
			      }
			 sum=sum+q;
			 n=n/10;
		}
if(sum==a)
{
	
System.out.println(a+" is a strong number");
}else {
	System.out.println(a+" is not strong number");
}
		
	}

}
