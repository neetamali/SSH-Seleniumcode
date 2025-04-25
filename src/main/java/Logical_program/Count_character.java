package Logical_program;

// Java program to count frequencies of
// characters in string using Hashmap
//OccurenceOfCharInString {
import java.io.*;
import java.util.*;
class Count_character{


	
	// Driver Code
		public static void main(String[] args)
		{
			String name = "Pratik Raut";
			//characterCount(name);
			countTheCharCount(name);
		}
		
	
		static void characterCount(String inputString)
	   {
		// Creating a HashMap containing char
		// as a key and occurrences as a value
		
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		// Converting given string to char array
		char[] strArray = inputString.toCharArray();

		// checking each char of strArray
		for (char c : strArray) 
		{
			if (charCountMap.containsKey(c)) 
			{

				// If char is present in charCountMap,
				// incrementing it's count by 1
				charCountMap.put(c, charCountMap.get(c) + 1);
			}
			else {

				// If char is not present in charCountMap,
				// putting this char to charCountMap with 1 as it's value
				charCountMap.put(c, 1);
			}
		}

		// Printing the charCountMap
		for (Map.Entry entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
		
		public static void countTheCharCount(String name){
			char[] namechar = name.toCharArray();
			Map<Character, Integer> m= new HashMap<>();
			
			for(Character c: namechar) {
				if(!m.containsKey(c)) {
					m.put(c, 1);
				} else {
					m.put(c, m.get(c)+1);
				}
			}
			Iterator itr = m.entrySet().iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
			System.out.println("************");
			
				for(Map.Entry<Character, Integer> s : m.entrySet()) {
					System.out.println(s.getKey() +"   "+s.getValue());
			
			}
			
		}

	
}
