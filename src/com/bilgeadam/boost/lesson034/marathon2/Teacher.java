package com.bilgeadam.boost.lesson034.marathon2;

import java.time.LocalDate;

public class Teacher extends Employee {
	
	private static int ACT_NUMBER = 0;


	
	private Teacher(String firstName, String lastName, LocalDate startDate, double salary) {
		super(firstName, lastName, salary, startDate);
		
	}
	
	private Teacher(TeacherBuilder teacherBuilder) {
		super(teacherBuilder.firstName, teacherBuilder.lastName, teacherBuilder.startSalary, teacherBuilder.startDate);
		
	}
	

	@Override
	public String createIDNumber() {
		Teacher.ACT_NUMBER++;
		String numAsString = String.format("T-%03d", Teacher.ACT_NUMBER);
		return numAsString;
	}

	public static class TeacherBuilder {

		private String firstName; //must
		private String middleName; //optional
		private String lastName; //must
		private String gender; //optional
		private boolean isMarried;//optional
		private LocalDate birthDate;//optional
		private String idNumber;
		private LocalDate startDate;
		private LocalDate endDate;
		private double startSalary;
		private String[] telephoneNumbers;
		
		public TeacherBuilder(String firstName, String lastName, LocalDate startDate, double salary) {
			this.firstName = firstName;
			this.lastName = lastName;
			this.startDate = startDate;
			this.startSalary = salary;
			
		}
		
		public TeacherBuilder middleName(String middle) {
			this.middleName = middle;
			return this;
		}
		
		public TeacherBuilder gender(String gender) {
			this.gender= gender;
			return this;
		}
		
		
		public TeacherBuilder isMarried(boolean isMarried) {
			this.isMarried = isMarried;
			return this;
		}
		public TeacherBuilder birthDate(LocalDate birthDate) {
			this.birthDate = birthDate;
			return this;
		}
		
		public Teacher build() {
			return new Teacher(this);
		}
	}
}
