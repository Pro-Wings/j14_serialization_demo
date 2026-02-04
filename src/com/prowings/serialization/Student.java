package com.prowings.serialization;

import java.io.Serializable;
import java.util.Objects;

public class Student implements Serializable {
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -1955633053764300900L;
	private int rollNumber;
	private transient String name;
	private String address1;

	public Student() {
		super();
	}

	public Student(int rollNumber, String name, String address) {
		super();
		this.rollNumber = rollNumber;
		this.name = name;
		this.address1 = address;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address) {
		this.address1 = address;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", address=" + address1 + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(address1, rollNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(address1, other.address1) && rollNumber == other.rollNumber;
	}
	
	
	
}
