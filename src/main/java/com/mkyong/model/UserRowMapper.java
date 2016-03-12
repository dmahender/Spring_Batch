package com.mkyong.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class UserRowMapper implements RowMapper<Employees> {

	@Override
	public Employees mapRow(ResultSet rs, int rowNum) throws SQLException {

		Employees employees = new Employees();
		employees.setEmployee_id(rs.getInt("employee_id"));
		employees.setFirst_name(rs.getString("first_name"));
		employees.setLast_name(rs.getString("last_name"));
		employees.setEmail(rs.getString("Email"));
		employees.setPhone_number(rs.getString("phone_number"));
		employees.setHire_Date(rs.getDate("Hire_Date"));
		employees.setJob_id(rs.getString("job_id"));
		employees.setSalary(rs.getInt("salary"));
		employees.setCommission_pct(rs.getInt("commission_pct"));
		employees.setManager_id(rs.getInt("manager_id"));
		employees.setDepartment_id(rs.getInt("department_id"));
		
		return employees;
	}

}