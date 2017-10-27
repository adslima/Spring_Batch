package com.mkyong;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author <a href="mailto:andrews.silva@accenture.com">andrews.silva</a>
 * @date 27 de out de 2017 14:36:31
 */
public class App {
	public static void main(final String[] args) {

		final String[] springConfig = { "spring/batch/jobs/job-spring-batch.xml" };

		final ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);

		final JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");

		final Job job = (Job) context.getBean("helloWorldJob");

		try {
			final JobExecution execution = jobLauncher.run(job, new JobParameters());

			System.out.println("Exit Status : " + execution.getStatus());

		} catch (final Exception e) {
			e.printStackTrace();
		}

		System.out.println("Done");

	}
}
