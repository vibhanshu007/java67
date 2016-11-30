package com.vibs.java67.array;

public class DuplicateInArray {

	public static void main(String[] args) {
		int[] duplicate = {1,1,2,2,3,4,8,9,9,8,8,9};
		int size = duplicate.length;
		/*int current = duplicate[0];
		boolean found = false;
		for (int i = 0; i < duplicate.length; i++) {
			if(duplicate[i]==current && !found){
				found=true;
			}else if(current!=duplicate[i]) {
				System.out.print(" "+current);
				current= duplicate[i];
				found= false;
			}
		}
		//  best way to remove duplicate value in array...
		System.out.print(" "+current);*/
		for (int i = 0; i < size; i++) {
			for (int j = 1; j < size; j++) {
				
				if(duplicate[i]==duplicate[j]){
					while(j<duplicate.length-1){
						duplicate[j] = duplicate[j+1];
						j++;
						
					}
					size --;
				}
			}
		}
		System.out.println("Size After deletion: " + size);
		 
        for (int k = 0; k < size; k++) 
        {
            System.out.print(duplicate[k]); // printing the values
        }
	}

}
