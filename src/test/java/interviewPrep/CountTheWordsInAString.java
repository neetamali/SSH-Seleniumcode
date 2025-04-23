package interviewPrep;

import java.util.HashMap;
import java.util.Map;

public class CountTheWordsInAString {
	public static void main(String[] args) {
		String str = "I am am new to to to to to the the the java Java java programming";
		Map<String,Integer> map =new HashMap<String,Integer>();
		String[] strsplit = str.split(" ");
		int count=1;
		for(int i=0; i<strsplit.length; i++) {
			if(!map.containsKey(strsplit[i])) {
				map.put(strsplit[i], count);
			}else map.put(strsplit[i],map.get(strsplit[i])+1);
			
		}
		
		for(String x: map.keySet()){
			System.out.println("The count of word "+x+" = "+ map.get(x) );
			
		}
		
	}

}
