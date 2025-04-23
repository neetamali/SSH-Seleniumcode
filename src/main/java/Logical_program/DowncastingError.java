package Logical_program;

public class DowncastingError {

	public static void main(String[] args) {

		class Test //super class
		{ 
		    void myMethod() 
		    { 
		        System.out.println("Test class"); 
		    } 
		} 
//		public class Derived extends Test //sub class
//		{ 
//		    void myMethod() 
//		    { 
//		        System.out.println("Derived class"); 
//		    } 
//		      
//		    public static void main(String[] args) 
//		    { 
//		    	
//		    	
//		        Derived object = new Test(); //down-casting
//		        object.myMethod(); 
//		    } 
//		    
//			//ANS = CE we cant use sub class to hold parent class object
//		}

	}


}
