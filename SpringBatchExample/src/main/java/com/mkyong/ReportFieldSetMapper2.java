package com.mkyong;

import java.text.SimpleDateFormat;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.mkyong.model.Report2;

/**
 *
 * @author <a href="mailto:andrews.silva@accenture.com">andrews.silva</a>
 * @date 27 de out de 2017 14:37:04
 */
public class ReportFieldSetMapper2 implements FieldSetMapper<Report2> {

	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

	@Override
	public Report2 mapFieldSet(final FieldSet fieldSet) throws BindException {

		final Report2 report2 = new Report2();
		report2.setId(1L);
		report2.setNome("Andrews");
		report2.setSobrenome("Lima");
		report2.setCpf("000.000.000-00");
		report2.setEndereco(null);
		report2.setEmail("limaandrews@msn.com");

		/* default format yyyy-MM-dd fieldSet.readDate(4); final String date = fieldSet.readString(4);
		 *
		 * try { report2.setDate(this.dateFormat.parse(date)); } catch (final ParseException e) {
		 * e.printStackTrace(); } */
		return report2;
	}

}