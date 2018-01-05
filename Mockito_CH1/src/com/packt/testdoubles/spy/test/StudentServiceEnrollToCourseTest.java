package com.packt.testdoubles.spy.test;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.packt.testdoubles.dummy.Student;
import com.packt.testdoubles.spy.StudentService;
import com.packt.testdoubles.spy.StudentServiceSpy;

public class StudentServiceEnrollToCourseTest {
	StudentService service = new StudentService();
	StudentServiceSpy spy = new StudentServiceSpy();
	Student bob;
	Student roy;
	
	@Before
	public void initializeStudentObjects() {
		bob = new Student("001", "Robert Anthony");
		roy = new Student("002", "Roy Noon");
		
		// set spy
		service.setSpy(spy);
		service.enrollToCourse("english", bob);
		service.enrollToCourse("history", roy);

	}

	@Test
	public void verifyNumberOfMethodInvocation_EnrollToCourse() throws Exception {		
		assertEquals(2, spy.getNumberOfMethodInvocation("enrollToCourse"));
	}
	
	@Test
	public void verifyNumberOfArgumentsOfBob() {
		
		// get the method arguments for the first call
		List<Object> methodArguments = spy.getMethodArguments("enrollToCourse", 1).getParams();
		// verify that Bob was enrolled to English first
		assertEquals("english", methodArguments.get(0));
		assertEquals(bob, methodArguments.get(1));
		
	}
	
	@Test
	public void verifyNumberOfArgumentsOfRoy() {

		// get the method arguments for the 2nd call
		List<Object> methodArguments2 = spy.getMethodArguments("enrollToCourse", 2).getParams();

		// verify that Roy was enrolled to history
		assertEquals("history", methodArguments2.get(0));
		assertEquals(roy, methodArguments2.get(1));
	}
}
