package com.mkyong.model;

import java.math.BigDecimal;

public class Report {

	private String In_date;
	private String Impressions;
	private String Clicks;
	private BigDecimal Earning;
	
	
	public String getImpressions() {
		return Impressions;
	}
	public void setImpressions(String impressions) {
		Impressions = impressions;
	}
	public String getClicks() {
		return Clicks;
	}
	public void setClicks(String clicks) {
		Clicks = clicks;
	}
	
	public String getIn_date() {
		return In_date;
	}
	public void setIn_date(String in_date) {
		In_date = in_date;
	}
	public BigDecimal getEarning() {
		return Earning;
	}
	public void setEarning(BigDecimal earning) {
		Earning = earning;
	}

	
}