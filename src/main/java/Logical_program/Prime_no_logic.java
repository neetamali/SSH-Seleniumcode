package Logical_program;

public class Prime_no_logic {

	public static void main(String[] args) {

		int n=96;
		
		boolean prime=true;
		for(int i=2; i<n; i++)
		{
			if (n%i==0)
			{
				prime=false;
				
				break;
			}
		}
		System.out.println("given no is prime?? "+prime);
		
		

	}

}
