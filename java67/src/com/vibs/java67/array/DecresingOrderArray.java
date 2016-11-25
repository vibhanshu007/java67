package com.vibs.java67.array;

import java.util.Arrays;
import java.util.Collections;

public class DecresingOrderArray {
		
	public static void main(String[] args) {
		Integer[] num = new Integer[]{52,26,78,15,4,8};
		System.out.println("Before Sort- "+num.toString());
		
		Arrays.sort(num, Collections.reverseOrder());
		System.out.println("sorted in reverse order"+Arrays.toString(num));
		
		
	}
}
