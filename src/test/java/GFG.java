public class GFG {

	// Driver code
	public static void main(String[] args)
	{
		// Upcasting
		child ch = new child();
		System.out.println(ch.id);
		ch.method();
		System.out.println(ch.name);
		
parent parent = new child();

		// Trying to Downcasting Implicitly
	//Child c = new Parent(); - > compile time error

		// Downcasting Explicitly
		child c = (child)parent;

		c.id = 1;
		System.out.println(c.name);
		System.out.println(c.id);
		c.method();
	}
}