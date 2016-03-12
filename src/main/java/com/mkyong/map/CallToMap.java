package com.mkyong.map;

import java.util.HashMap;

import org.springframework.web.client.RestTemplate;

import com.mkyong.model.Coffee;

public class CallToMap {
	
	private static final HashMap<String, String> hmd = new HashMap<String, String>();

	RestTemplate restTemplate = new RestTemplate();
    Coffee coffee = restTemplate.getForObject("http://localhost:8182/SpringMVC/rest/coffee/Neena", Coffee.class);

	public CallToMap() {
    hmd.put("First Name", coffee.getFirst_name());
    hmd.put("Last Name", coffee.getLast_name());
    hmd.put("Age", Integer.toString(coffee.getAge()));
    hmd.put("Email", coffee.getEmail());
    hmd.put("phone number", coffee.getPhone_number());
    hmd.put("job id", coffee.getJob_id());
    hmd.put("Salary", Integer.toString(coffee.getSalary()));
    hmd.put("commission", Integer.toString(coffee.getCommission_pct()));
    hmd.put("managerId", Integer.toString(coffee.getManager_id()));
    hmd.put("departmentId", Integer.toString(coffee.getDepartment_id()));
    hmd.put("score", Integer.toString(coffee.getScore()));
    
  }

		public static HashMap<String, String> getHmd() {
			return hmd;
		}
}
