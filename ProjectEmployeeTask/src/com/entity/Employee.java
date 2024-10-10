package com.entity;

public class Employee {

	private int id ;
	private String name;
	private String departent;
	private int salary;
	private String hiringdate;
	private String address;
	public Employee() {
		super();
	}
	public Employee(int id, String name, String departent, int salary, String 
			hiringdate, String address) {
		super();
		this.id = id;
		this.name = name;
		this.departent = departent;
		this.salary = salary;
		this.hiringdate = hiringdate;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartent() {
		return departent;
	}
	public void setDepartent(String departent) {
		this.departent = departent;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getHiringdate() {
		return hiringdate;
	}
	public void setHiringdate(String hiringdate) {
		this.hiringdate = hiringdate;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", departent=" + departent + ", salary=" + salary
				+ ", hiringdate=" + hiringdate + ", address=" + address + "]";
	}
}
