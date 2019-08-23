package com.example.springboot.springboot;

import hbjjh.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BooksController {

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return Arrays.asList(new Book(1L,"Nenu Naa Paithyam","Sannihith Kavala"));
    }
}
