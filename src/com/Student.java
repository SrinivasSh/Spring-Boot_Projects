package com;

public class Student {

	private static Student student;

	private Student() { // make constructor private

	}

	public static Student getStudent() {

		if (student == null) {
			student = new Student(); /// Creation of object
		}
		return student;
	}

}
