package com.oreilly.sdata;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		BookService service = context.getBean(BookService.class);
		Book book = new Book("Catcher in the Rye", new Date(), 250, new BigDecimal("15.00"));
		service.save(book);
	}
}
