package com.myapp.org.tree;

import java.util.List;

public class Employee {
	int empId;
	int importance;
	List<Employee> subordinates;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getImportance() {
		return importance;
	}
	public void setImportance(int importance) {
		this.importance = importance;
	}
	public Employee(int empId, int importance) {
		super();
		this.empId = empId;
		this.importance = importance;
	}
	public List<Employee> getSubordinates() {
		return subordinates;
	}
	public void setSubordinates(List<Employee> subordinates) {
		this.subordinates = subordinates;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", importance=" + importance + ", subordinates=" + subordinates + "]";
	}

}
