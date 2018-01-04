package com.packt.testdoubles.dummy;

import java.math.BigDecimal;
import java.util.List;

public class Teacher {

	private int numberOfSubjects;
	List<Mark> marks;

	public Grades generateGrade(List<Mark> marks) {
		this.marks = marks;

		BigDecimal percentage = calculatePercent();

		if (percentage.compareTo(new BigDecimal("90.00")) > 0) {
			return Grades.Excellent;
		}

		if (percentage.compareTo(new BigDecimal("75.00")) > 0) {
			return Grades.VeryGood;
		}

		if (percentage.compareTo(new BigDecimal("60.00")) > 0) {
			return Grades.Good;
		}

		if (percentage.compareTo(new BigDecimal("40.00")) > 0) {
			return Grades.Average;
		}

		return Grades.Poor;
	}

	private BigDecimal getAggregatedMarks() {

		setNumberOfSubjects(marks.size());

		BigDecimal aggregate = BigDecimal.ZERO;

		for (Mark mark : marks) {
			aggregate = aggregate.add(mark.getMark());
		}

		return aggregate;
	}

	private void setNumberOfSubjects(int size) {
		this.numberOfSubjects = size;
	}

	private BigDecimal calculatePercent() {

		BigDecimal percent = new BigDecimal(getAggregatedMarks().doubleValue() / getNumberOfSubjects());
		return percent;
	}

	public int getNumberOfSubjects() {
		return numberOfSubjects;
	}
}
