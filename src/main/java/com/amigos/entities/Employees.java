package com.amigos.entities;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Employees")
public class Employees {
	
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO )
	@Column(name = "EmployeeID")
	private int employeeId;
	@Column(name = "FirstName")
	private String firstName;
	@Column(name = "LastName")
	private String lastName;
	@Column(name = "Gender")
	private String gender;
	@Column(name = "DateOfBirth")
	private LocalDate dateOfBirth;
	@Column(name = "Email")
	private String email;
	@Column(name = "Phone")
	private String phone;
	@Column(name = "Address")
	private String address;
	@Column(name = "NationalID")
	private String nationalId;
	@Column(name = "MaritalStatus")
	private String martialStatus;
	@Column(name = "EmergencyContactPhone")
	private String emergencyContactPhone;
	
	@ManyToOne
	@JoinColumn(name = "DepartmentID")
	private Departments department;
	
	@Column(name = "Position")
	private String position;
	@Column(name = "SkillSet")
	private String skillset;
	@Column(name = "EmployementStartDate")
	private LocalDate employementStartDate;
	@Column(name = "EmployementEndDate")
	private LocalDate employementEndDate;
	@Column(name = "Salary")
	private BigDecimal salary;
	@Column(name = "EmployeementStatus")
	private String employeementStatus;
	@Column(name = "BankAccountNumber")
	private String bankAccountNumber;
	
	@ManyToOne
	@JoinColumn(name = "Manager")
	private Employees manager;
	
	@ManyToOne
	@JoinColumn(name="RoleID")
	private Roles role;
	
	public Employees()
	{
		
	}

	public Employees(int employeeId, String firstName, String lastName, String gender, LocalDate dateOfBirth,
			String email, String phone, String address, String nationalId, String martialStatus,
			String emergencyContactPhone, Departments department, String position, String skillset,
			LocalDate employementStartDate, LocalDate employementEndDate, BigDecimal salary, String employeementStatus,
			String bankAccountNumber, Employees manager, Roles role) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.nationalId = nationalId;
		this.martialStatus = martialStatus;
		this.emergencyContactPhone = emergencyContactPhone;
		this.department = department;
		this.position = position;
		this.skillset = skillset;
		this.employementStartDate = employementStartDate;
		this.employementEndDate = employementEndDate;
		this.salary = salary;
		this.employeementStatus = employeementStatus;
		this.bankAccountNumber = bankAccountNumber;
		this.manager = manager;
		this.role = role;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNationalId() {
		return nationalId;
	}

	public void setNationalId(String nationalId) {
		this.nationalId = nationalId;
	}

	public String getMartialStatus() {
		return martialStatus;
	}

	public void setMartialStatus(String martialStatus) {
		this.martialStatus = martialStatus;
	}

	public String getEmergencyContactPhone() {
		return emergencyContactPhone;
	}

	public void setEmergencyContactPhone(String emergencyContactPhone) {
		this.emergencyContactPhone = emergencyContactPhone;
	}

	public Departments getDepartment() {
		return department;
	}

	public void setDepartment(Departments department) {
		this.department = department;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getSkillset() {
		return skillset;
	}

	public void setSkillset(String skillset) {
		this.skillset = skillset;
	}

	public LocalDate getEmployementStartDate() {
		return employementStartDate;
	}

	public void setEmployementStartDate(LocalDate employementStartDate) {
		this.employementStartDate = employementStartDate;
	}

	public LocalDate getEmployementEndDate() {
		return employementEndDate;
	}

	public void setEmployementEndDate(LocalDate employementEndDate) {
		this.employementEndDate = employementEndDate;
	}

	public BigDecimal getSalary() {
		return salary;
	}

	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}

	public String getEmployeementStatus() {
		return employeementStatus;
	}

	public void setEmployeementStatus(String employeementStatus) {
		this.employeementStatus = employeementStatus;
	}

	public String getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	public Employees getManager() {
		return manager;
	}

	public void setManager(Employees manager) {
		this.manager = manager;
	}

	public Roles getRole() {
		return role;
	}

	public void setRole(Roles role) {
		this.role = role;
	}
	
	 

}
