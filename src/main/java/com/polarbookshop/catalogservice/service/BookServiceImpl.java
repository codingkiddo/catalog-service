package com.polarbookshop.catalogservice.service;

import org.springframework.stereotype.Service;

import com.polarbookshop.catalogservice.domain.Book;
import com.polarbookshop.catalogservice.domain.BookAlreadyExistsException;
import com.polarbookshop.catalogservice.domain.BookNotFoundException;
import com.polarbookshop.catalogservice.persistence.BookRepository;

@Service
public class BookServiceImpl implements BookService {

	private final BookRepository bookRepository;

	public BookServiceImpl(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@Override
	public Iterable<Book> viewBookList() {
		return this.bookRepository.findAll();
	}

	@Override
	public Book viewBookDetails(String isbn) {
		return this.bookRepository.findByIsbn(isbn).orElseThrow(() -> new BookNotFoundException(isbn));
	}

	@Override
	public Book addBookToCatalog(Book book) {
		if (this.bookRepository.existsByIsbn(book.isbn())) {
			throw new BookAlreadyExistsException(book.isbn());
		}
		return this.bookRepository.save(book);
	}

	@Override
	public void removeBookFromCatalog(String isbn) {
		this.bookRepository.deleteByIsbn(isbn);
	}

	@Override
	public Book editBookDetails(String isbn, Book book) {
		return bookRepository.findByIsbn(isbn).map(existingBook -> {
			var bookToUpdate = new Book(existingBook.isbn(), book.title(), book.author(), book.price());
			return bookRepository.save(bookToUpdate);
		}).orElseGet(() -> addBookToCatalog(book));
	}

}
