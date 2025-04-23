package Collection;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListOperations {
public static void main(String[] args) {
	List<Integer> intlist = new LinkedList<Integer>();
	intlist.add(1);
	intlist.add(2);
	intlist.add(3);
	intlist.add(4);
	System.out.println(intlist);
	
	Queue<String> strque = new LinkedList();
	strque.offer("Neeta");
	strque.offer("Mali");
	strque.offer("Kshirsagar");
	strque.add("Dhruvi");
	strque.poll();
	System.out.println(strque);
	
	
}
}
