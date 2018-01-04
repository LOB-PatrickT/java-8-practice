package com.packt.testdoubles.stub.test;

import java.sql.SQLException;

import com.packt.testdoubles.stub.StudentDAO;

public class ConnectionTimedOutStudentDAOStub implements StudentDAO {
	
	public String create(String name, String className) throws SQLException {
		throw new SQLException("DB connection timed out");
	}
	
}