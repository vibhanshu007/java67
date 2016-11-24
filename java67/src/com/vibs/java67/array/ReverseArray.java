package com.vibs.java67.array;

import java.util.Arrays;

public class ReverseArray {
	
	// method 1 -- 
	/* The time complexity of this algorithm is O(n/2) which is O(N) because we are iterating over array till
	midpoint only. */
	
	
		
	public static void  firstMethod(String[] input){
		
		System.out.println("Reverse Array before -" +Arrays.toString(input));
		for (int i = 0; i < input.length/2; i++) {
			String temp = input[i];
			input[i] = input[input.length-i-1];
			input[input.length-i-1]= temp;
		}
		System.out.println("Reverse Array  -" +Arrays.toString(input));
	}
	
	public void secondMethod(){
		
		
	}
	
	public static void main(String[] args) {
		String[] name = {"Rajeev","Praveen","Manish","Wasim","Abhay","Prashant"};
		firstMethod(name);
	}

}
