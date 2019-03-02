package com.kub.domain.employee;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Employee {

	public Employee() {
		
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long employeeId;
	
	@Column
	private String firstName;
	
	@Column
	private String lastName;
	
	@Column
	private String phoneNumber;
	
	
	
	@Temporal(TemporalType.DATE)
	private String hireDate;
	
	@ManyToOne(fetch=FetchType.LAZY,targetEntity=Job.class)
	@JoinColumn(name="job_id", foreignKey=@ForeignKey(foreignKeyDefinition = "job_fk"))
	private Job job;
	
	@ManyToOne(fetch=FetchType.LAZY,targetEntity=Department.class)
	@JoinColumn(name="department_id", foreignKey=@ForeignKey(foreignKeyDefinition = "department_fk"))
	private Department department;
	
	

	public Employee(Long employeeId, String firstName, String lastName, String phoneNumber, String hireDate, Job job,
			Department department) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.hireDate = hireDate;
		this.job = job;
		this.department = department;
	}
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getHireDate() {
		return hireDate;
	}
	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}
	public Job getJob() {
		return job;
	}
	public void setJob(Job job) {
		this.job = job;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	
}
