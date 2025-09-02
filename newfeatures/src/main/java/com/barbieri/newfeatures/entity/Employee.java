package com.barbieri.newfeatures.entity;

import java.util.Objects;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="employee")
public class Employee {
	
    private String name;
    private int age;
    private String position;
    private String department;
    private String city;
    private String state;
    private String workFormat;
    private double salary; 
    
	public Employee(String name, int age, String position, String department, String city, String state,
			String workFormat, double salary) {
		super();
		this.name = name;
		this.age = age;
		this.position = position;
		this.department = department;
		this.city = city;
		this.state = state;
		this.workFormat = workFormat;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getWorkFormat() {
		return workFormat;
	}
	public void setWorkFormat(String workFormat) {
		this.workFormat = workFormat;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", position=" + position + ", department=" + department
				+ ", city=" + city + ", state=" + state + ", workFormat=" + workFormat + ", salary=" + salary
				+ ", getName()=" + getName() + ", getAge()=" + getAge() + ", getPosition()=" + getPosition()
				+ ", getDepartment()=" + getDepartment() + ", getCity()=" + getCity() + ", getState()=" + getState()
				+ ", getWorkFormat()=" + getWorkFormat() + ", getSalary()=" + getSalary() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(age, city, department, name, position, salary, state, workFormat);
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
		return age == other.age && Objects.equals(city, other.city) && Objects.equals(department, other.department)
				&& Objects.equals(name, other.name) && Objects.equals(position, other.position)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary)
				&& Objects.equals(state, other.state) && Objects.equals(workFormat, other.workFormat);
	}	
}