package Logical_program;

public class Palindrome_reverse_string {

	public static void main(String[] args) {

		String A="NAYAN";
		String B="";
		
		for(int i=A.length()-1; i>=0; i--) // i=6 (start);i=0 (end); i-- (reverse order)
		{
			B=B+A.charAt(i);
		}
		System.out.println(B);
		
		//to check wheather the string is palindrome or not
		if (A.equals(B)) 
		{
			System.out.println("Given string is Palindrome "+B);
			
		} else 
		{
			System.out.println("Given string is not palindrome "+B);

		}

	}

}
