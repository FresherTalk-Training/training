// Package created 
package com.freshertalk.training;

// package imported 
import java.util.Scanner;

// Class 
public class PrimeNumberChecker {

	// Main class
	public static void main(String[] args) {
		// To scan number from user in screen. 
		Scanner scan = new Scanner(System.in);
		System.out.println("******** PRIME NUMBER CHECKER ******** ");
		System.out.print("Plesae enter a number: ");
		int num = scan.nextInt();
		
		// method call 
		boolean result = isPrimeNumber(num);
		
		if(result) {
			System.out.println(num + " number is Prime Number");
		} else {
			System.out.println(num + " number is not a Prime Number");
		}
		

	}

	
	// Method definition   
	private static boolean isPrimeNumber(int num) {
		
		if(num == 2) {
			return true;
		}
		
		if(num % 2 == 0) {
			return false;
		}
		
		for(int i = 3; i <= Math.sqrt(num); i += 2) {
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
