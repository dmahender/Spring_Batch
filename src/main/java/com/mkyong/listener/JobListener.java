package com.mkyong.listener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;
import org.springframework.batch.core.annotation.AfterJob;
import org.springframework.batch.core.annotation.BeforeJob;


public class JobListener implements JobExecutionListener{
	private final static Log logger = LogFactory.getLog(JobListener.class);
	
	@Override
	@AfterJob
	public void afterJob(JobExecution jobexecution) {
		if(jobexecution.getStatus()==BatchStatus.COMPLETED){
			logger.info(jobexecution);
			//System.out.println(jobexecution.getStatus());
		}
		else{
			if(jobexecution.getStatus()==BatchStatus.FAILED){
				logger.error(jobexecution);
			}
		}
		
	}

	@Override
	@BeforeJob
	public void beforeJob(JobExecution jobexecution) {
		if(jobexecution.getStatus()==BatchStatus.STARTED){
			logger.info(jobexecution);
			
		}
		else{
			if(jobexecution.getStatus()==BatchStatus.STOPPED){
				logger.error(jobexecution);
			}
		}
		
	}
	
}


	

