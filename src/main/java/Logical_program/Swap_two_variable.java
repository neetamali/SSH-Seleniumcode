package Logical_program;

public class Swap_two_variable {

	public static void main(String[] args) {

		// Declare variable
		String a="Encapsulation";
		String b="Abstraction";
		
		System.out.println("before swaping a is "+a);
		System.out.println("before swaping b is "+b);

		a=a+b;  // append 2nd string to 1st
		
		
		b=a.substring(0, a.length()-b.length()); // store initial string a in string b
		a=a.substring(b.length());  // store initial string b in string a
		
		System.out.println("After swapping a is "+a);
		System.out.println("After swapping b is "+b);

		
	}

}
