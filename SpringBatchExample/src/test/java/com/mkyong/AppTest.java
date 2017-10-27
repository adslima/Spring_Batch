/* package com.mkyong;
 * 
 * import static org.junit.Assert.assertEquals;
 * 
 * import org.junit.Test; import org.junit.runner.RunWith; import org.springframework.batch.core.BatchStatus;
 * import org.springframework.batch.core.JobExecution; import
 * org.springframework.batch.test.JobLauncherTestUtils; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.test.context.ContextConfiguration; import
 * org.springframework.test.context.junit4.SpringJUnit4ClassRunner; *//**
																		 *
																		 * @author <a href=
																		 *         "mailto:andrews.silva@accenture.com">andrews.silva</a>
																		 * @date 27 de out de 2017 14:11:32
																		 */
/* @RunWith(SpringJUnit4ClassRunner.class)
 * 
 * @ContextConfiguration(locations = { "classpath:spring/batch/jobs/job-hello-world.xml",
 * "classpath:spring/batch/config/test-context.xml" }) public class AppTest { *//**
																				*
																				*/
/* @Autowired private JobLauncherTestUtils jobLauncherTestUtils; *//**
																	 *
																	 * <code><pre></pre></code>
																	 * 
																	 * @throws Exception void
																	 *//* @Test public void launchJob() throws
																		 * Exception {
																		 * 
																		 * final JobExecution jobExecution =
																		 * this.jobLauncherTestUtils.launchJob
																		 * (); // JobExecution jobExecution
																		 * this.jobLauncherTestUtils.
																		 * launchStep("step1");
																		 * 
																		 * assertEquals(BatchStatus.COMPLETED,
																		 * jobExecution.getStatus());
																		 * 
																		 * } } */