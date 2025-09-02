package com.bruna.customer.entity;

import java.util.Objects;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="customer")
public class Customer {
	
	private String name;
	private String lastname;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastname;
	}
	public void setLastName(String lastName) {
		this.lastname = lastName;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(lastname, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(lastname, other.lastname) && Objects.equals(name, other.name);
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", lastName=" + lastname + "]";
	}	
}