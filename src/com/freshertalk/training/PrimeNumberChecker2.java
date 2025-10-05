package com.freshertalk.training;

import java.util.Scanner;

public class PrimeNumberChecker2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = scan.nextInt();
		boolean isPrime = true;
		
		if(num <= 1) {
			isPrime = false;
		} else{
			for (int i = 2; i <= num/2; i++) {
				if(num% i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		
		if(isPrime) {
			System.out.println(num + " is a Prime Number");
		} else {
			System.out.println(num + " is a NOT Prime Number");
		}
		
		scan.close();

	}

}
