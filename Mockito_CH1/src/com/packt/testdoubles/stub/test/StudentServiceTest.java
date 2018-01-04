package com.packt.testdoubles.stub.test;

import static org.junit.Assert.assertFalse;

import org.junit.Test;

import com.packt.testdoubles.stub.CreateStudentResponse;
import com.packt.testdoubles.stub.StudentService;
import com.packt.testdoubles.stub.StudentServiceImpl;

public class StudentServiceTest {

	private StudentService studentService;
	
	@Test
	public void when_connection_times_out_then_the_student_is_not_saved() {
		studentService = new StudentServiceImpl(new ConnectionTimedOutStudentDAOStub());
		
		String classNumber = "IX";
		String studentName = "John Smith";
		
		CreateStudentResponse resp = studentService.create(studentName, classNumber);
		assertFalse(resp.isSuccess());
	}
	
}
