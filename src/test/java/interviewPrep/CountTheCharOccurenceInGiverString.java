package interviewPrep;

import java.util.HashMap;
import java.util.Map;

public class CountTheCharOccurenceInGiverString {
	public void checkCharCountByHashMap(String str) {
		Map<Character, Integer> m = new HashMap();
		char[] ch = str.toCharArray();
		int count = 1;
		
		for(int i=0;i<ch.length;i++) {
			if(!m.containsKey(ch[i])) {
				m.put(ch[i], count);
			}else m.put(ch[i], m.get(ch[i])+1);			
		}
		
		for(char c: m.keySet()) {
			System.out.println(c+":"+ m.get(c));
		}
		
	}
	
public static void main(String[] args) {
	CountTheCharOccurenceInGiverString o = new CountTheCharOccurenceInGiverString();
	o.checkCharCountByHashMap("my name is Neeta Pramod Kshirsagar");
}
}
