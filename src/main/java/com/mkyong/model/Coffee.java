package com.mkyong.model;

import java.sql.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "coffee")
public class Coffee {

	String first_name;
	String last_name;
	int age;
	int employee_id;
	String Email;
	String phone_number;

	String job_id;
	int salary;
	int commission_pct;
	int manager_id;
	int department_id;
	int score;

    
	public String getFirst_name() {
		return first_name;
	}
	
	@XmlElement
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	@XmlElement
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public int getAge() {
		return age;
	}

	@XmlElement
	public void setAge(int age) {
		this.age = age;
	}

	
	
	public int getEmployee_id() {
		return employee_id;
	}
	
	@XmlElement
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmail() {
		return Email;
	}

	@XmlElement
	public void setEmail(String email) {
		Email = email;
	}

	public String getPhone_number() {
		return phone_number;
	}

	@XmlElement
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getJob_id() {
		return job_id;
	}

	@XmlElement
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}

	public int getSalary() {
		return salary;
	}

	@XmlElement
	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getCommission_pct() {
		return commission_pct;
	}

	@XmlElement
	public void setCommission_pct(int commission_pct) {
		this.commission_pct = commission_pct;
	}

	public int getManager_id() {
		return manager_id;
	}

	@XmlElement
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}

	public int getDepartment_id() {
		return department_id;
	}

	@XmlElement
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	


	public int getScore() {
		return score;
	}
	@XmlElement
	public void setScore(int score) {
		this.score = score;
	}

	public Coffee(String first_name, String last_name, int age,
			int employee_id, String email, String phone_number,
			String job_id, int salary, int commission_pct, int manager_id,
			int department_id,int score) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.age = age;
		this.employee_id = employee_id;
		Email = email;
		this.phone_number = phone_number;
		
		this.job_id = job_id;
		this.salary = salary;
		this.commission_pct = commission_pct;
		this.manager_id = manager_id;
		this.department_id = department_id;
		this.score=score;
	}

	/*public Coffee(String first_name,String last_name, int age) {
		this.first_name=first_name;
		this.last_name=last_name;
		this.age=age;
		
	}*/

	public Coffee() {
		super();
	}

	
	
}