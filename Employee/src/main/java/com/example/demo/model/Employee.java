package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer employeeId;
	@Column(name="employeeName")
    private String employeeName;
	@Column(name="employeeContact")
    private String employeeContact;
	@Column(name="employeeAdress")
    private String employeeAdress;
	@Column(name="employeeGender")
    private String employeeGender;
	@Column(name="employeeDepartment")
    private String employeeDepartment;
	@Column(name="employeeSkills")
    private String employeeSkills;
	public Employee() {
		super();
	}
	public Employee(Integer employeeId, String employeeName, String employeeContact, String employeeAdress,
			String employeeGender, String employeeDepartment, String employeeSkills) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeContact = employeeContact;
		this.employeeAdress = employeeAdress;
		this.employeeGender = employeeGender;
		this.employeeDepartment = employeeDepartment;
		this.employeeSkills = employeeSkills;
	}
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeContact() {
		return employeeContact;
	}
	public void setEmployeeContact(String employeeContact) {
		this.employeeContact = employeeContact;
	}
	public String getEmployeeAdress() {
		return employeeAdress;
	}
	public void setEmployeeAdress(String employeeAdress) {
		this.employeeAdress = employeeAdress;
	}
	public String getEmployeeGender() {
		return employeeGender;
	}
	public void setEmployeeGender(String employeeGender) {
		this.employeeGender = employeeGender;
	}
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
	public String getEmployeeSkills() {
		return employeeSkills;
	}
	public void setEmployeeSkills(String employeeSkills) {
		this.employeeSkills = employeeSkills;
	}
    
}
