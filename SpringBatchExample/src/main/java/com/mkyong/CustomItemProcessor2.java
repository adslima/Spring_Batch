package com.mkyong;

import org.springframework.batch.item.ItemProcessor;

import com.mkyong.model.Person;

/**
 *
 * @author <a href="mailto:andrews.silva@accenture.com">andrews.silva</a>
 * @date 27 de out de 2017 14:36:55
 */
public class CustomItemProcessor2 implements ItemProcessor<Person, Person> {

	/* (non-Javadoc)
	 *
	 * @see org.springframework.batch.item.ItemProcessor#process(java.lang.Object) */
	@Override
	public Person process(final Person item) throws Exception {
		System.out.println("Processing..." + item);
		return null;
	}

}