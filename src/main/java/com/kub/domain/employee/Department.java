package com.kub.domain.employee;

import java.util.List;

import javax.persistence.CascadeType;
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

@Entity
public class Department {

	private static final String targetEntity = null;

	public Department() {

	}
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@Column(name="department_id")
	private Long departmentId;
	@Column
	private String departmentName;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="location_id",foreignKey=@ForeignKey(foreignKeyDefinition="location_fk"))
	private Location location;
	
	@OneToMany(cascade=CascadeType.ALL,mappedBy="department")
	private List<Employee> employees;

	public Department(Long departmentId, String departmentName, Location location, List<Employee> employees) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.location = location;
		this.employees = employees;
	}

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	
	
}
