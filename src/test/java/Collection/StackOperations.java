package Collection;

import java.util.List;
import java.util.Stack;

public class StackOperations {
public static void main(String[] args) {
	Stack<String> name = new Stack<String>();
	name.add("a");
	name.add("B");
	System.out.println(name);
	System.out.println(name.peek());
	name.pop();
	System.out.println(name.peek());
	name.push("D");
	name.push("E");
	System.out.println(name);
}
}
