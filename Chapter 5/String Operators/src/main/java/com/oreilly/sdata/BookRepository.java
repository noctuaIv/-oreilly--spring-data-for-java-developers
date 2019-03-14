package com.oreilly.sdata;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	public List<Book> findByTitle(String title);
	
	public List<Book> findByTitleLike(String title);

	public List<Book> findByTitleContaining(String title);
	
	public List<Book> findByTitleStartingWith(String title);
	
	public List<Book> findByTitleEndingWith(String title);

	public List<Book> findByTitleIgnoreCase(String title);
	
}
