package com.mkyong.writer;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.batch.item.ItemWriter;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mkyong.model.Employees;
import com.mkyong.model.Report;

public class Dbwriter implements ItemWriter<Employees> {

	private static final String INSERT = "insert into DUP_EMPLOYEE"+"(EMPLOYEE_ID,FIRST_NAME,LAST_NAME,EMAIL,PHONE_NUMBER,HIRE_DATE,JOB_ID,SALARY,COMMISSION_PCT,MANAGER_ID,DEPARTMENT_ID) values (?,?,?,?,?,?,?,?,?,?,?)";
	
	private JdbcTemplate jdbctemplate;
	
	private Dbwriter(DataSource ds) {
		this.jdbctemplate= new JdbcTemplate(ds);
		
	}

	@Override
	public void write(List<? extends Employees> items) throws Exception {
		for(Employees item:items){
			jdbctemplate.update(INSERT,item.getEmployee_id(),item.getFirst_name(),item.getLast_name(),item.getEmail(),item.getPhone_number(),item.getHire_Date(),item.getJob_id(),item.getSalary(),item.getCommission_pct(),item.getManager_id(),item.getDepartment_id());
		}
		
	}
	
	
	
	/*@Override
	public void write(List<? extends Report> items) throws Exception {
		for(Report item:items){
		
		jdbctemplate.update(INSERT,item.getIn_date(),item.getImpressions(),item.getClicks(),item.getEarning());
		}
	}*/

}
