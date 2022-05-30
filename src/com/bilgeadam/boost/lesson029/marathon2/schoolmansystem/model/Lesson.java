package com.bilgeadam.boost.lesson029.marathon2.schoolmansystem.model;

import java.time.DayOfWeek;
import java.util.List;

import com.bilgeadam.boost.lesson029.marathon2.schoolmansystem.employees.Teacher;

public class Lesson {
	
	private Teacher mainTeacher;
	private Teacher secondaryTeacher;
	private Lessons lessonName;
	private DayOfWeek day;
	private List<Student> studentList;
	

	public Lesson(Teacher mainTeacher, Teacher secondaryTeacher, Lessons courseName,
			DayOfWeek day, List<Student> studentList) {
		super();
		this.mainTeacher = mainTeacher;
		this.secondaryTeacher = secondaryTeacher;
		this.lessonName = courseName;
		this.day = day;
		this.studentList = studentList;
	}

	public Lesson(Teacher mainTeacher, Teacher secondaryTeacher, List<Student> studentList) {
		super();
		this.mainTeacher = mainTeacher;
		this.secondaryTeacher = secondaryTeacher;
		this.studentList = studentList;
	}

	public Teacher getMainTeacher() {
		return this.mainTeacher;
	}

	public void setMainTeacher(Teacher mainTeacher) {
		this.mainTeacher = mainTeacher;
	}

	public Teacher getSecondaryTeacher() {
		return this.secondaryTeacher;
	}

	public void setSecondaryTeacher(Teacher secondaryTeacher) {
		this.secondaryTeacher = secondaryTeacher;
	}

	public Lessons getLessonName() {
		return this.lessonName;
	}

	public void setLessonName(Lessons lessonName) {
		this.lessonName = lessonName;
	}

	public DayOfWeek getDay() {
		return this.day;
	}

	public void setDay(DayOfWeek day) {
		this.day = day;
	}


	public List<Student> getStudentList() {
		return this.studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public String toString() {
		return "Lesson [mainTeacher=" + this.mainTeacher + ", secondaryTeacher=" + this.secondaryTeacher
				+ ", lessonName=" + this.lessonName + ", day=" + this.day + ", studentList=" + this.studentList + "]";
	}

}
