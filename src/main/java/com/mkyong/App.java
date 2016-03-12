package com.mkyong;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*Inorder to run this project, you need to run web project SpringRestTemplate. 
This SpringRestTemplate provides services and the service call is done in processor menthod of spring batch.
This Spring batch reads data from employee table and writes data in to Dup_employee table.
*/

public class App {
	
	private final static Log logger = LogFactory.getLog(App.class);
	
	public static void main(String[] args) {
		
		String[] springConfig  = 
			{	"spring/batch/config/database.xml", 
				"spring/batch/config/context.xml",
				"spring/batch/jobs/job-report.xml" 
			};
		
		ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
		
		JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");
		Job job = (Job) context.getBean("reportJob");

		try {
			JobParameters jobparam = new JobParametersBuilder().addLong("time", System.currentTimeMillis()).toJobParameters();
			JobExecution execution = jobLauncher.run(job, jobparam);
			
			logger.equals(execution.getStatus());
			
			
			System.out.println("Exit Status : " + execution.getStatus());
			System.out.println("Done");

		} catch (Exception e) {
        logger.info("error"+e);
		}
     
		

	}
		
		/*String springConfig = "spring/batch/jobs/job-report.xml";
		 
		ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);
	 
	  }*/
}
