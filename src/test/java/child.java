class child extends parent {
	int id=5;

	// Overriding the parent method
	// to print the signature of the
	// child class
	@Override void method()
	{
		System.out.println("Method from Child");
	}
}

// Demo class to see the difference
// between upcasting and downcasting
