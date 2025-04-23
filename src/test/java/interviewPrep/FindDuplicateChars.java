package interviewPrep;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateChars {
	public static void main(String[] args) {
		String str = "Programming";
		char ch[] = str.toCharArray();
		int count = 1;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0;i<ch.length;i++) {
			if(!map.containsKey(ch[i])) {
				map.put(ch[i], count);
			}else map.put(ch[i], map.get(ch[i])+1);
			
		}
		for(char c: map.keySet()) {
			if(map.get(c)>1) {
				System.out.println(c+" char is repeating "+map.get(c)+" times.");
			}
		}
		
		
		}

}
