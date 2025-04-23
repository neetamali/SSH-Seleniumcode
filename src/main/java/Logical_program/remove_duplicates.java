package Logical_program;

import java.util.LinkedHashSet;

public class remove_duplicates {

		
		 //main() method start  
	    public static void main(String args[])   
	    {   
	        //Create string variable with default value  
	        int[] str = {4,2,2,1,4,2,4,3,6,9,7};  
	        
	        //removeDuplicates() method by passing the string as an argument   
	        removeDuplicates(str);   
	    }   
	    
		//Create removeDuplicates() method for removing duplicates using LinkedHashSet  
	    static void removeDuplicates(int[] str)   
	    {     
	        //Create LinkedHashSet of type character   
	        LinkedHashSet<Character> set = new LinkedHashSet<>();   
	        
	        //Add each character of the string into LinkedHashSet   
	        for(int i=0;i<str.length;i++)   
	            set.add((char) str.length);   
	            
	        // print the string after removing duplicate characters   
	        for(Character ch : set)   
	            System.out.print(ch);   
	    
	    }   

}
