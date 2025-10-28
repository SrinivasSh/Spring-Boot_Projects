package com;

public class Test {
	
	public static void main(String[] args) {
	
		
		Student stude1=Student.getStudent();
		Student stude2=Student.getStudent();
		
		System.out.println(stude1.hashCode());
		System.out.println(stude2.hashCode());
		System.out.println(stude1==stude2);
	}

}
