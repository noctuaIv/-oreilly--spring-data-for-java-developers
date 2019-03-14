package com.oreilly.sdata;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

	@Query("select b from Book b")
	public List<Book> queryOne();

	@Query("select b from Book b where b.pageCount > ?1")
	public List<Book> queryTwo(int pageCount);

	@Query("select b from Book b where b.title = :title")
	public List<Book> queryThree(@Param("title") String title);

}
