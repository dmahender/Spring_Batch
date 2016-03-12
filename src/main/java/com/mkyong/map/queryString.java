package com.mkyong.map;

import org.hibernate.Session;




public class queryString {
private Session session;
public void querinf(Session session){
	session.createSQLQuery("SELECT * FROM EMPLOYEES");
}
}