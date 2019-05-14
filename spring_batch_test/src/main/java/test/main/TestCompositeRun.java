package test.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;

public class TestCompositeRun {

	public static void main(String[] args) throws Exception{
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring/job-test-composite-context.xml"});
		JobLauncher jobLauncher = context.getBean(JobLauncher.class);
		Job testJob = context.getBean("TestCompositeJob", Job.class);
		JobParameters jobParameters = new JobParametersBuilder()
				.addString("start_time", Long.toString(System.currentTimeMillis()))
				.addString("param1", "col1-1")
				.toJobParameters();
		jobLauncher.run(testJob, jobParameters);
		//
		((ClassPathXmlApplicationContext)context).close();
	}

}
