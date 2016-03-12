package com.mkyong.processor;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import org.springframework.batch.item.ItemProcessor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;
import com.mkyong.map.CallToMap;
import com.mkyong.model.Employees;

public class processor implements ItemProcessor<Employees, Employees> {
	CallToMap calltomap = new CallToMap();
	
	
	
	String first_name=calltomap.getHmd().get("First Name");
	
	
	
	String score=calltomap.getHmd().get("score");

String salary = calltomap.getHmd().get("salary");




	@SuppressWarnings("static-access")
	@Override
	public Employees process(Employees item) throws Exception {
		
		String datafirst=item.getFirst_name();
		
		String last_name=item.getLast_name();

		String data_salary =Integer.toString(item.getSalary());
		
				if (first_name.equals(datafirst))
				{

					OutputStream file = new FileOutputStream(new File("C:/Stash_Admin_Work/Test.pdf"));
					Document document = new Document();
					PdfWriter.getInstance(document, file);
					document.open();
					document.add(new Phrase("Hi "+ first_name +" "+last_name+" "+"your score for this year is "+score+" please try to increase you score for future benefits!!"));
					document.close();


				}

				else {
					
					
					
	
				}
		
				//item.setFirst_name(first_name);

				return item;
		}

}
