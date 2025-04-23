package practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class interview {
public static void main(String[] args) {
	String str = "ACDacdAEe";
	
	char[] strarr= str.toCharArray();
	Map<Character, Integer> m1 = new HashMap<>();
	int count=1;
	for(Character ch: strarr) {
		if(!m1.containsKey(ch)) {
			m1.put(ch, count);
		}else m1.put(ch, m1.get(ch)+1);
	}
	Iterator itr = m1.entrySet().iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next()); 
	
	}
}
}
