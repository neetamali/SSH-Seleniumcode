package Logical_program;

import java.util.Scanner;

public class find_duplicate_array {

	public static void main(String[] args) {
			

		 int[] arr = new int[] {1, 2, 3, 4, 2, 7, 8, 8, 3};  
	        System.out.println("Duplicate elements in given array: ");  
	        findDuplicateValuesInArray(arr);
	        
	        //Searches for duplicate element  
			/*
			 * for(int i = 0; i<arr.length; i++) { for(int j = i+1; j<arr.length; j++) {
			 * if(arr[i]==arr[j])
			 * 
			 * System.out.println(arr[j]); } }
			 */
	}
	static int counter=0;
	public static void findDuplicateValuesInArray(int[] numbers) {
		
		for(int i=0;i<numbers.length;i++) {
			for(int j=i+1;j<numbers.length;j++) {
				if(numbers[i]==numbers[j]) {
					counter++;
					
				}
			}
			System.out.println(numbers[i]+" is repeated "+ counter+" times.");
		}
		
		
	}

}
