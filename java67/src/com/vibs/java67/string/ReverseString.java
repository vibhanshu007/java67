package com.vibs.java67.string;

public class ReverseString {
	public static void main(String[] args) {
		String myString = "VibsBro";
		
		// 1st method
		
		StringBuffer sb = new StringBuffer(myString);
		System.out.println(sb.reverse());
		
		// 2nd method Iterative method
		
		char[] strArray  = myString.toCharArray();
		for (int i = strArray.length-1; i >=0 ; i--) {
			System.out.print(strArray[i]);
		}
		
		// 3rd method
		System.out.println(recursiveMethod(myString));
		
	}
	static String recursiveMethod(String str)
	{
		if ((null == str) || (str.length() <= 1))
		{
			return str;
		}
		
		return recursiveMethod(str.substring(1)) + str.charAt(0);
	}
	
}
