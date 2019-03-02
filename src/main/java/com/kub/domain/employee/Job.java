package com.kub.domain.employee;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Job {
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@Column(name="jobId")
private Long jobId;
	
	@Column	
private String jobTitle;
@Column
private double minSalary;

@Column
private double maxSlaary;
	
@OneToMany(cascade=CascadeType.ALL,mappedBy="job")
private List<Employee> employee;

public Job() {

}

public Job(Long jobId, String jobTitle, double minSalary, double maxSlaary, List<Employee> employee) {
	super();
	this.jobId = jobId;
	this.jobTitle = jobTitle;
	this.minSalary = minSalary;
	this.maxSlaary = maxSlaary;
	this.employee = employee;
}

public Long getJobId() {
	return jobId;
}

public void setJobId(Long jobId) {
	this.jobId = jobId;
}

public String getJobTitle() {
	return jobTitle;
}

public void setJobTitle(String jobTitle) {
	this.jobTitle = jobTitle;
}

public double getMinSalary() {
	return minSalary;
}

public void setMinSalary(double minSalary) {
	this.minSalary = minSalary;
}

public double getMaxSlaary() {
	return maxSlaary;
}

public void setMaxSlaary(double maxSlaary) {
	this.maxSlaary = maxSlaary;
}

public List<Employee> getEmployee() {
	return employee;
}

public void setEmployee(List<Employee> employee) {
	this.employee = employee;
}



}
