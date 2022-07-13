package model;

public class Course {

	private int courseId;
	private String courseName;
	private int durationInMonths;
	private double fee;
	private Qualification eligibility;
	private static int courseIdGenerator = 100;

	public Course() {
	}

	public Course(String courseName, int durationInMonths, double fee, Qualification eligibility) {
		//this.courseId = ++courseIdGenerator;
		this.courseName = courseName;
		this.durationInMonths = durationInMonths;
		this.fee = fee;
		this.eligibility = eligibility;
	}

	public static int getCourseIdGenerator() {
		return courseIdGenerator;
	}

	public static void setCourseIdGenerator(int courseIdGenerator) {
		Course.courseIdGenerator = courseIdGenerator;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getDurationInMonths() {
		return durationInMonths;
	}

	public void setDurationInMonths(int durationInMonths) {
		this.durationInMonths = durationInMonths;
	}

	public double getFee() {
		return fee;
	}

	public void setFee(double fee) {
		this.fee = fee;
	}

	public Qualification getEligibility() {
		return eligibility;
	}

	public void setEligibility(Qualification eligibility) {
		this.eligibility = eligibility;
	}

	public static void main(String[] args) {
		System.out.println("Student not found");
	}

}
