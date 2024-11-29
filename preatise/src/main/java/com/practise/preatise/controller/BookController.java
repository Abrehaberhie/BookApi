package com.practise.preatise.controller;

import com.practise.preatise.entitiy.Book;
import com.practise.preatise.service.BookServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/app/v1/Book")
public class BookController {
    @Autowired
    private BookServiceImple bookServiceImple;
    @PostMapping("/Create")
    public ResponseEntity<String> createBook(Book book)
    {
       String status= bookServiceImple.createBook(book);
        return new ResponseEntity<String>(status, HttpStatus.CREATED);
    }
    @GetMapping("/get")
    public ResponseEntity<Book> getBookById(Integer bookid)
    {
     Book status=   bookServiceImple.findBookById(bookid);
        return new ResponseEntity<>(status,HttpStatus.OK);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Book>> getAllBooks()
    {
       List<Book> status =bookServiceImple.getAllBooks();
       return new ResponseEntity<>(status,HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Book> updateBook(Book book)
    {
       Book status= bookServiceImple.updateBook(book);
       return new ResponseEntity<>(status,HttpStatus.OK);
    }
    public ResponseEntity<String> deletBook(Book book)
    {
      String status=  bookServiceImple.deletBook(book);

      return new ResponseEntity<>(status,HttpStatus.OK);
    }
}
