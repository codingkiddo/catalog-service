package com.polarbookshop.catalogservice.persistence;

import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.stereotype.Repository;

import com.polarbookshop.catalogservice.domain.Book;

@Repository
public class InMemoryBookRepository implements BookRepository {

	private static final Map<String, Book> books = new ConcurrentHashMap<>();

	@Override
	public Iterable<Book> findAll() {
		return InMemoryBookRepository.books.values();
	}

	@Override
	public Optional<Book> findByIsbn(String isbn) {
		return existsByIsbn(isbn) ? Optional.of(InMemoryBookRepository.books.get(isbn))
				: Optional.empty();
	}

	@Override
	public boolean existsByIsbn(String isbn) {
		return InMemoryBookRepository.books.get(isbn) != null;
	}

	@Override
	public Book save(Book book) {
		InMemoryBookRepository.books.put(book.isbn(), book);
		return book;
	}

	@Override
	public void deleteByIsbn(String isbn) {
		InMemoryBookRepository.books.remove(isbn);
	}

}
