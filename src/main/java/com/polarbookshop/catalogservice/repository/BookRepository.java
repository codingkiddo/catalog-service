package com.polarbookshop.catalogservice.repository;

import java.util.Optional;

import com.polarbookshop.catalogservice.domain.Book;

public interface BookRepository {

	Iterable<Book> findAll();
	
	Optional<Book> findByisbn(String isbn);
	
	boolean existsByIsbn(String isbn);
	
	Book save(Book book);
	
	void deleteByIsbn(String isbn);
}
