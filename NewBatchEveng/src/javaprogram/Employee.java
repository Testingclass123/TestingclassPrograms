package javaprogram;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter you name");
	String n=scn.next();
	System.out.println("Enter Gender");
	char c=scn.next().charAt(0);
	System.out.println("Enter salary");
	double sal=scn.nextDouble();
	System.out.println("Name="+n+", Gender="+c+", Salary="+sal);

	}

}
