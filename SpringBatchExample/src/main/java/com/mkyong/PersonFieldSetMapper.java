package com.mkyong;

import java.text.SimpleDateFormat;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import com.mkyong.model.Person;

/**
 *
 * @author <a href="mailto:andrews.silva@accenture.com">andrews.silva</a>
 * @date 27 de out de 2017 14:37:04
 */
public class PersonFieldSetMapper implements FieldSetMapper<Person> {

	private SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

	/* (non-Javadoc)
	 *
	 * @see
	 * org.springframework.batch.item.file.mapping.FieldSetMapper#mapFieldSet(org.springframework.batch.item.
	 * file.transform.FieldSet) */
	@Override
	public Person mapFieldSet(final FieldSet fieldSet) throws BindException {

		final Person person = new Person();
		person.setId(1L);
		person.setNome("Andrews");
		person.setSobrenome("Lima");
		person.setCpf("000.000.000-00");
		person.setEndereco(null);
		person.setEmail("limaandrews@msn.com");

		/* default format yyyy-MM-dd fieldSet.readDate(4); final String date = fieldSet.readString(4);
		 *
		 * try { report2.setDate(this.dateFormat.parse(date)); } catch (final ParseException e) {
		 * e.printStackTrace(); } */
		return person;
	}

}