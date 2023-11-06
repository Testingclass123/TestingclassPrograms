package javaprogram;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Missing {
	 public static void main(String[] args) {
		 int[] numbers = {21,23,25,28,30};
		    
		    HashSet<Integer> set = new HashSet<>();

		    for (int i = numbers[0]; i < numbers[numbers.length - 1]; i++) {
		        set.add(i);
		    }

		    for (int i = 0; i < numbers.length; i++) {
		        set.remove(numbers[i]);
		    }

		    for (int x : set) {
		        System.out.print(x + " ");
		    }
	 }
}
