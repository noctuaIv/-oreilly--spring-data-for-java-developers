package com.oreilly.sdata;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		BookRepository repository = context.getBean(BookRepository.class);
		
		@SuppressWarnings("serial")
		List<Book> books = repository.findAll(new ArrayList<Long>(){{
			add(1L);
			add(3L);
			add(7L);
		}});

		for(Book book:books){
			System.out.println(book);
		}
	}
}
