package com.packt.testdoubles.mock;

import com.packt.testdoubles.dummy.Student;
import com.packt.testdoubles.spy.MethodInvocation;
import com.packt.testdoubles.spy.StudentService;

public class StudentServiceMock extends StudentService {
	
	private StudentServiceMockObject mock;
	
	public void setMock(StudentServiceMockObject mock)  {
		this.mock = mock;
	}

	@Override
	protected void registerStudentServiceMethodCall(String courseName, Student student, String methodName) {
		
		MethodInvocation invocation = new MethodInvocation();
		invocation.addParam(courseName).addParam(student).setMethod(methodName);
		mock.registerMethodCall(invocation);
		
	}
}
