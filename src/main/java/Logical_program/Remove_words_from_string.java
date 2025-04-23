package Logical_program;

public class Remove_words_from_string {
	
	// Java Program to Remove a Given Word From a String

		// Main driver method
		public static void main(String[] args)
		{
			// Given String as input from which
			// word has to be removed
			String str = "This is the Geeks For Geeks";

			// Desired word to be removed
			String word = "the";

			// Replace all words by "" string
			// using replaceAll() method
			str = str.replaceAll("the", "");

			// Trim the string using trim() method
			str = str.trim();

			// Printing the final string
			System.out.print(str);
		}
	


}
