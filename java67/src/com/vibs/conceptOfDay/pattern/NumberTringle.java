package com.vibs.conceptOfDay.pattern;

import java.util.Scanner;

public class NumberTringle {
	
	public static void main(String[] args) {
		
		Scanner sn = new Scanner(System.in);
		System.out.print("Enter the no of row - ");
		int noOfRows = sn.nextInt();
		int rowCount = 1;
		 for (int i = noOfRows; i > 0; i--)
	        {
	            //Printing i spaces at the beginning of each row
	 
	            for (int j = 1; j <= i; j++)
	            {
	                System.out.print(" ");
	            }
	 
	            //Printing 'rowCount' value 'rowCount' times at the end of each row
	 
	            for (int j = 1; j <= rowCount; j++)
	            {
	                System.out.print(rowCount+" ");
	            }
	 
	            System.out.println();
	 
	            //Incrementing the rowCount
	 
	            rowCount++;
	        }
	    }
	}


