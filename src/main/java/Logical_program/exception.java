package Logical_program;

public class exception {
	
	  public static void main (String[] args)
	    {
	        try
	        {
	            int a = 0;
	            int b = 20 / a;
	            System.out.println ("b = " + b);
	        }

	  catch(Exception e)
	        {
	            System.out.println ("Divide by zero error");
	        }
	 
	        finally
	        {
	            System.out.println ("inside the finally block");
	      
	 }
	        
//	        finally {
//	        	
//	        	System.out.println ("inside the finally block");
//				
//			}
	        
	    }

}
