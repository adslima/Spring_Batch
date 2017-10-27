package com.mkyong;

import org.springframework.batch.item.ItemProcessor;

import com.mkyong.model.Report;

/**
 *
 * @author <a href="mailto:andrews.silva@accenture.com">andrews.silva</a>
 * @date 27 de out de 2017 14:36:55
 */
public class CustomItemProcessor implements ItemProcessor<Report, Report> {

	@Override
	public Report process(final Report item) throws Exception {
		System.out.println("Processing..." + item);
		return item;
	}

}