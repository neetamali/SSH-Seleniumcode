package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListOperations {
public static void main(String[] args) {
	List<String> arrlist1 = new ArrayList<String>();
	arrlist1.add("Apple");
	arrlist1.add("Banana");
	arrlist1.add("Mango");
	arrlist1.add("Pear");
	arrlist1.add("Pineapple");
	arrlist1.add("pomegranate");
	System.out.println("arrlist1 objects : "+arrlist1);
	ArrayList<String> arrlist2 = new ArrayList<String>();
	arrlist2.add("Neeta");
	arrlist2.add("Kavita");
	arrlist2.add("Sarita");
	arrlist2.add("Shital");
	System.out.println("arrlist2 objects : "+arrlist2);
	arrlist1.addAll(arrlist2);
	arrlist1.add(2, "Pramod");
	System.out.println("Before remove Arraylist1 size : " + arrlist1.size());
	arrlist1.remove(1);
	System.out.println("After remove Arraylist1 size : " + arrlist1.size());
	System.out.println("random Element: "+arrlist1.get(7));
	
	List<Integer> arrlist3 = new ArrayList();
	arrlist3.add(1);
	arrlist3.add(12);
	arrlist3.add(123);
	arrlist3.add(1234);
	System.out.println(arrlist3.contains(12));
	System.out.println(arrlist3);
	//iterating through the elements
	for(int i=0; i<arrlist3.size();i++) {
		System.out.println("For loop tradition way: "+ arrlist3.get(i));
	}
	for(Integer ele: arrlist3) {
		System.out.println("For each loop advance way: "+ele);
		
	}
	Iterator<Integer> itr = arrlist3.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
