package com.freshertalk.training;

import java.util.Scanner;

public class SwapTwoNumberUsingTempVar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter first value: ");
		int firstValue = scan.nextInt();
		
		System.out.print("Enter second value: ");
		int secondValue = scan.nextInt();
		
		System.out.println("Before Swap: \nfirstValue: " + firstValue + "\n" + "secondValue: " + secondValue);
		
		int tempVar = firstValue;
		firstValue = secondValue;
		secondValue = tempVar;
		
		System.out.println("After Swap: \nfirstValue: " + firstValue + "\n" + "secondValue: " + secondValue);
	}

}
