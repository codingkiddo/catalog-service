package com.polarbookshop.catalogservice.service;

import org.springframework.stereotype.Service;

import com.polarbookshop.catalogservice.domain.Book;
import com.polarbookshop.catalogservice.exception.BookAlreadyExistsException;
import com.polarbookshop.catalogservice.exception.BookNotFoundException;
import com.polarbookshop.catalogservice.repository.BookRepository;

@Service
public class BookService {

	private final BookRepository bookRepository;

	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public Iterable<Book> viewBookList() {
		return bookRepository.findAll();
	}

//	public Book viewBookDetails(String isbn) {
//		return bookRepository.findByisbn(isbn).orElseThrow(() -> new BookNotFoundException(isbn));
//	}

	public Book addBookToCatalog(Book book) {
//		if (bookRepository.existsByIsbn(book.isbn())) {
//			throw new BookAlreadyExistsException(book.isbn());
//		}
		return bookRepository.save(book);
	}

	public void removeBookFromCatalog(String isbn) {
		bookRepository.deleteByIsbn(isbn);
	}
	
//	public Book editBookDetails(String isbn, Book book) {
//		return bookRepository.findByisbn(isbn).map(existingBook -> {
//			var bookToUpdate = new Book(
//					existingBook.id(), 
//					existingBook.isbn(), 
//					book.title(), 
//					book.author(), 
//					book.price(), 
//					null, 
//					existingBook.createdDate(), 
//					existingBook.lastModifiedDate(), 
//					existingBook.version());
//			return bookRepository.save(bookToUpdate);
//		}).orElseGet(() -> addBookToCatalog(book));
//	}
}
