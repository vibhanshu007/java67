package com.vibs.java67.array;

import java.util.Arrays;

public class AddingTwoArray {
	public static void main(String[] args) {
		
		int[] even = {1,2,3,4,5};
		int[] odd = {6,7,8,9,10};
		int[] result= add (even,odd);
		
		System.out.println("First array-" +Arrays.toString(even));
		System.out.println("Second array-" +Arrays.toString(odd));
		System.out.println("Result array-" +Arrays.toString(result));
	}
	public static int[] add(int[] first,int[] second){
		
		int length = first.length < second.length ? first.length: second.length;
		int [] result =new  int[length];
		for (int i = 0; i < length; i++) {
			
			 result [i]= first[i]+ second[i];
		}
		return result;
		
	}
}
