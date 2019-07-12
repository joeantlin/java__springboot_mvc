package com.jlinares.mvc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.jlinares.mvc.models.Book;
import com.jlinares.mvc.repositories.BookRepository;

@Service
public class BookService {
	private final BookRepository bookRepo;
	
	public BookService(BookRepository bookRepo) {
		this.bookRepo = bookRepo;
	}
	// returns all the books
    public List<Book> allBooks() {
        return bookRepo.findAll();
    }
    // creates a book
    public Book createBook(Book b) {
        return bookRepo.save(b);
    }
    // retrieves a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook = bookRepo.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    // updates a book
    public Book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
    	Optional<Book> optionalBook = bookRepo.findById(id);
        if(optionalBook.isPresent()) {
            Book updated = optionalBook.get();
            updated.setTitle(title);
            updated.setDescription(desc);
            updated.setLanguage(lang);
            updated.setNumberOfPages(numOfPages);
            return bookRepo.save(updated);
            
        } else {
            return null;
        }
    }
    // deletes a book
    public void deleteBook(Long id) {
    	bookRepo.deleteById(id);
    }
    	
}
