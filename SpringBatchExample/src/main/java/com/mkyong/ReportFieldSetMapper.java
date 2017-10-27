package com.mkyong;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.mkyong.model.Report;

/**
 *
 * @author <a href="mailto:andrews.silva@accenture.com">andrews.silva</a>
 * @date 27 de out de 2017 14:37:04
 */
public class ReportFieldSetMapper implements FieldSetMapper<Report> {

	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

	@Override
	public Report mapFieldSet(final FieldSet fieldSet) throws BindException {

		final Report report = new Report();
		report.setId(fieldSet.readInt(0));
		report.setSales(fieldSet.readBigDecimal(1));
		report.setQty(fieldSet.readInt(2));
		report.setStaffName(fieldSet.readString(3));

		// default format yyyy-MM-dd
		// fieldSet.readDate(4);
		final String date = fieldSet.readString(4);
		try {
			report.setDate(this.dateFormat.parse(date));
		} catch (final ParseException e) {
			e.printStackTrace();
		}

		return report;

	}

}