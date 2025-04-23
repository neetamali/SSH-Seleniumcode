package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.checkerframework.checker.units.qual.m2;

public class MapPractice {
public static void main(String[] args) {
Map<String, Integer> m1= new HashMap<>();
m1.put("Banana", 1);
m1.put("Apple", 2);
Iterator itr = m1.entrySet().iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
	
}
//using for each loop
for(Map.Entry<String, Integer> hm : m1.entrySet()) {
	System.out.println("Keys: "+hm.getKey()+"   "+" Value: "+hm.getValue());
}

List<String> list= new ArrayList<>();
list.add("Beeta");
list.add("Beeta");
list.add("Beeta");
list.add("  ");
list.add("Beeta");
Iterator it = list.iterator();
while(it.hasNext()) {
	System.out.print(it.next()+", ");
}
}



}
