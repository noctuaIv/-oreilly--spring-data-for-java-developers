package com.oreilly.sdata;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface BookRepository extends BaseRepository<Book, Long> {

	@Transactional
	@Modifying
	@Query("update Book b set b.pageCount = ?2 where b.title like ?1")
	public int setPageCount(String title, int pageCount);
}
