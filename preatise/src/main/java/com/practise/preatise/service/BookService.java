package com.practise.preatise.service;

import com.practise.preatise.entitiy.Book;

import java.util.List;

public interface BookService {
    public String createBook(Book book);
    public Book findBookById(Integer Bookid);
    public List<Book> getAllBooks();
   public Book updateBook(Book book);
   public String deletBook(Book book);
}
