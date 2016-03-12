package com.mkyong;

import java.util.Date;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;

 

public class RunScheduler {
 
  
  private JobLauncher jobLauncher;
 
  
  private Job job;
  
  
 
  
  
  public JobLauncher getJobLauncher() {
	return jobLauncher;
}





public Job getJob() {
	return job;
}





public void setJobLauncher(JobLauncher jobLauncher) {
	this.jobLauncher = jobLauncher;
}





public void setJob(Job job) {
	this.job = job;
}





public void run() {

    try {
 
	String dateParam = new Date().toString();
	JobParameters param = 
	  new JobParametersBuilder().addString("date", dateParam).toJobParameters();
 
	System.out.println(dateParam);
 
	JobExecution execution = jobLauncher.run(job, param);
	System.out.println("Exit Status : " + execution.getStatus());
 
    } catch (Exception e) {
	e.printStackTrace();
    }
 
  }
}
