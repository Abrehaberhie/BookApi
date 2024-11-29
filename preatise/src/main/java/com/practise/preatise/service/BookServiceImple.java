package com.practise.preatise.service;

import com.practise.preatise.entitiy.Book;
import com.practise.preatise.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImple implements BookService{
    @Autowired
    private BookRepository bookRepository;
    @Override
    public String createBook(Book book) {
        bookRepository.save(book);
        return "book is created";
    }

    @Override
    public Book findBookById(Integer bookid) {
       Optional<Book> findById= bookRepository.findById(bookid);
       if(findById.isPresent()) {
           return findById.get();
       }
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        List<Book> books=  bookRepository.findAll();
        return books;
    }

    @Override
    public Book updateBook(Book book) {
       Book updatedBook= bookRepository.save(book);
        return updatedBook;
    }



    @Override
    public String deletBook(Book book) {
        bookRepository.delete(book);
        return "Book has been deleted";
    }
}
