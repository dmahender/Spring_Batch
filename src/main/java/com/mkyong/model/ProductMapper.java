package com.mkyong.model;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

public class ProductMapper implements FieldSetMapper<Report> {

	@Override
	public Report mapFieldSet(FieldSet fieldSet) throws BindException {
	Report user = new Report();
	user.setClicks(fieldSet.readString("Clicks"));
	user.setEarning(fieldSet.readBigDecimal("Earning"));
	user.setImpressions(fieldSet.readRawString("Impressions"));
	user.setIn_date(fieldSet.readString("In_date"));
		return user;
	}

}
