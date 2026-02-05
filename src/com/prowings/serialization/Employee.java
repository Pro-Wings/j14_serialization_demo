package com.prowings.serialization;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable{
	
	private static final long serialVersionUID = 5137283248551547719L;

	private int empId;
	private String name;
	private transient Address address;

	public Employee() 
	{
		System.out.println("inside Employee() no-arg constructor!!");
	}

	public Employee(int empId, String name, Address address) {
		super();
		System.out.println("inside Employee() all-arg constructor!!");
		this.empId = empId;
		this.name = name;
		this.address = address;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, empId, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(address, other.address) && empId == other.empId && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", address=" + address + "]";
	}

	

}
