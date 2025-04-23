
public class Tata extends Car {
public void Engine() {
	System.out.println("I am in Tata class in Engine method");
}

public static void main(String[] args) {
	Tata t = new Tata();
	t.colour();
	t.name();
	t.Engine();
	
	Car c = new Tata();
	c.colour();
	c.name();
	
	Car cc = new Car();
	cc.name();
	cc.colour();
	
}
}
