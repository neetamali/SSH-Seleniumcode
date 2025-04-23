package Collection;
class A{
	
	 A(){ System.out.println("Inside A default constructor."); }
	 
	A(int age){
		System.out.println("A- parameterised constructor "+age);
	}
}

class B extends A{
B(){
	super();

		System.out.println("B-default constructor");
	}
}

public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
B b= new B();


	}

}
