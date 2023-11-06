package javaprogram;

import java.util.Scanner;

public class ifelseifstateemet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if-else-if statement
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a=scn.nextInt();
		System.out.println("Enter 2nd number");
		int b=scn.nextInt();
		
		if(a>b) {
			System.out.println(a+" is greater than "+b);
		}else if(a<b){
			System.out.println(a+" is Smaller than "+b);
		}
		else  {
			System.out.println(a+" is equal to "+b);
		}
		
	}

}
