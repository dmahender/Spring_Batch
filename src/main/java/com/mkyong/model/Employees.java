package com.mkyong.model;

import java.sql.Date;

public class Employees {

	private int employee_id;
	private String first_name;
	private String last_name;
	private String Email;
	private String phone_number;
	private Date Hire_Date;
	private String job_id;
	private int salary;
	private int commission_pct;
	private int manager_id;
	private int department_id;
	
	public Employees() {
		// TODO Auto-generated constructor stub
	}
	public Employees(String first_name, String last_name,
			int employee_id, String email, String phone_number,
			String job_id, int salary, int commission_pct, int manager_id,
			int department_id) {
	
		this.first_name = first_name;
		this.last_name = last_name;
	
		this.employee_id = employee_id;
		this.Email = email;
		this.phone_number = phone_number;
		
		this.job_id = job_id;
		this.salary = salary;
		this.commission_pct = commission_pct;
		this.manager_id = manager_id;
		this.department_id = department_id;
		;
	}
	
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public Date getHire_Date() {
		return Hire_Date;
	}
	public void setHire_Date(Date hire_Date) {
		Hire_Date = hire_Date;
	}
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getCommission_pct() {
		return commission_pct;
	}
	public void setCommission_pct(int commission_pct) {
		this.commission_pct = commission_pct;
	}
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	
	
	
}