package com.oreilly.sdata;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>, BookRepositoryCustom {
	
	public List<Book> findByPageCountGreaterThan(int pageCount, Sort sort);
}
