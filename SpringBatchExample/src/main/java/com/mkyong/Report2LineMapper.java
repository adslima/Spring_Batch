/**
 * Cielo S.A. Projeto Convivência
 *
 * SpringBatchExample com.mkyong
 *
 * Copyright 2017
 */
package com.mkyong;

import java.util.Map;

import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.JsonLineMapper;

import com.mkyong.model.Report2;

/**
 * @author <a href="mailto:andrews.silva@accenture.com">andrews.silva</a>
 * @date 27 de out de 2017 15:04:49
 */
public class Report2LineMapper implements LineMapper<Report2> {

	/**
	 *
	 */
	private JsonLineMapper m;

	/* (non-Javadoc)
	 *
	 * @see org.springframework.batch.item.file.LineMapper#mapLine(java.lang.String, int) */
	@Override
	public Report2 mapLine(final String line, final int lineNumber) throws Exception {
		final Map<String, Object> report2AsMap = this.m.mapLine(line, lineNumber);

		final Report2 report2 = new Report2();
		// map fields
		return report2;
	}

	/**
	 *
	 * <code><pre></pre></code>
	 *
	 * @param m void
	 */
	public void setM(final JsonLineMapper m) {
		this.m = m;
	}
}
