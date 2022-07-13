package model;

import java.time.LocalDate;

public class Student {
	private int rollNo;
	private String name;
	private LocalDate dateOfBirth;
	private Qualification qualification;
	private String phoneNo;
	private String email;
	// default => package private
	private String address;
	private static final String collegeName; // blank final : declared but not initialized immediately
	private static int rollNoGenerator=0;
	// class name starting letters+ctrl+space=enter

	public Student() {
		// is no-args constructor
	}
	// ctrl+shift+f=>formatting

	static {
		//static initializer block to initialize static and static final variables
		//this is initialized when class is loaded
		collegeName = "LTI College";
	}

	public Student(String name, LocalDate dateOfBirth, Qualification qualification, String phoneNo, String email,
			String address) {
		//this.rollNo=++rollNoGenerator;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.qualification = qualification;
		this.phoneNo = phoneNo;
		this.email = email;
		this.address = address;
	}
	// ctrl+shift+s = save all files
	// ctrl+space+enter = auto complete

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Qualification getQualification() {
		return qualification;
	}

	public void setQualification(Qualification qualification) {
		this.qualification = qualification;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getRollNo() {
		return rollNo;
	}

	public static String getCollegename() {
		return collegeName;
	}
	

}
