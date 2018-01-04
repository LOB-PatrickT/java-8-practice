package com.packt.testdoubles.dummy;


/**
 * @author P100X1
 *
 */
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
