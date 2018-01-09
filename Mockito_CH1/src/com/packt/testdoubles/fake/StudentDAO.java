package com.packt.testdoubles.fake;

import java.util.List;

import com.packt.testdoubles.dummy.Student;

public interface StudentDAO {

	void batchUpdate(List<Student> students);
	
}
