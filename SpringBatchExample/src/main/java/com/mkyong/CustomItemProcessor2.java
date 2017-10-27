package com.mkyong;

import org.springframework.batch.item.ItemProcessor;

import com.mkyong.model.Report2;

/**
 *
 * @author <a href="mailto:andrews.silva@accenture.com">andrews.silva</a>
 * @date 27 de out de 2017 14:36:55
 */
public class CustomItemProcessor2 implements ItemProcessor<Report2, Report2> {

	/* (non-Javadoc)
	 *
	 * @see org.springframework.batch.item.ItemProcessor#process(java.lang.Object) */
	@Override
	public Report2 process(final Report2 item) throws Exception {
		System.out.println("Processing..." + item);
		return null;
	}

}