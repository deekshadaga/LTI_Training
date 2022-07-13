package model;

import java.time.LocalDate;

public class Registration {
	private int registrationNo;
	private LocalDate registrationDate;
	private int CourseId;
	private int rollNo;
	
	public Registration() {
		// TODO Auto-generated constructor stub
	}

	public Registration(LocalDate registrationDate, int courseId, int rollNo) {
		super();
		this.registrationDate = registrationDate;
		CourseId = courseId;
		this.rollNo = rollNo;
	}

	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
	}

	public int getCourseId() {
		return CourseId;
	}

	public void setCourseId(int courseId) {
		CourseId = courseId;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public int getRegistrationNo() {
		return registrationNo;
	}
}
