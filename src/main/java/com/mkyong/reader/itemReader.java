package com.mkyong.reader;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import com.mkyong.model.Employees;

public class itemReader implements ItemReader<Employees> {
	 private static Session factory; 
	private List<String> employees;
	@Override
	public Employees read() throws Exception, UnexpectedInputException, ParseException,
			NonTransientResourceException {
		Employees employee = null;
		String sql = "SELECT * FROM EMPLOYEES";
		SQLQuery query = factory.createSQLQuery(sql);
		query.addEntity(Employees.class);
		List employees = query.list();
	 return employee;
	}

}
