package com.freshertalk.training;

public class SwapTwoNumberWithoutUsingTempVar {

	public static void main(String[] args) {
		int a = 10;
		int b = 15; 
		
		System.out.println("Before Swap:\n a: " + a + "\n" + "b: " + b); 
		
		a = a + b; 		//a = 25 
		b = a - b;		// b = 10
		a = a - b; 		// a = 15 
		
		System.out.println("After Swap:\n a: " + a + "\n" + "b: " + b); 

	}

}
