package com.jetdev.springdatajpabbl.controller;

import com.jetdev.springdatajpabbl.dto.out.BookCardView;
import com.jetdev.springdatajpabbl.entity.Book;
import com.jetdev.springdatajpabbl.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequiredArgsConstructor
@RequestMapping("books")
public class BookController {

    private final BookService service;

    @GetMapping
    public Page<Book> findAll(Pageable pageable, Date from, Date to) {
        return this.service.findAll(pageable, from, to);
    }

    @GetMapping("cards")
    public Page<BookCardView> findAllBookCard(Pageable pageable, Date from, Date to) {
        return this.service.findAllBookCard(pageable, from, to);
    }

    @GetMapping("cards/{id}")
    public BookCardView findBookCardById(@PathVariable Long id) {
        return this.service.findBookCardById(id);
    }
}
