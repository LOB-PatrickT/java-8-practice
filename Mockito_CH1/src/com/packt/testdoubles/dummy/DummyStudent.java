package com.packt.testdoubles.dummy;

public class DummyStudent extends Student{
	
	protected DummyStudent() {
		super(null, null);
	}
	
	public String getRoleNumber( ) {
		throw new RuntimeException("Dummy Student");
	}
	
	public String getName() {
		throw new RuntimeException("Dummy Student");
	}
}
