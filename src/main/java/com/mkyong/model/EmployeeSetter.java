package com.mkyong.model;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.springframework.batch.item.database.ItemPreparedStatementSetter;

public class EmployeeSetter implements ItemPreparedStatementSetter<Employees> {

	@Override
	public void setValues(Employees item, PreparedStatement ps)
			throws SQLException {
		ps.setInt(1, item.getEmployee_id());
		ps.setString(2, item.getFirst_name());
		ps.setString(3, item.getLast_name());
		ps.setString(4, item.getEmail());
		ps.setString(5, item.getPhone_number());
		ps.setDate(6, item.getHire_Date());
		ps.setString(7, item.getJob_id());
		ps.setInt(8, item.getSalary());
		ps.setInt(9, item.getCommission_pct());
		ps.setInt(10, item.getManager_id());
		ps.setInt(11, item.getDepartment_id());
		
		
	}
	

}
