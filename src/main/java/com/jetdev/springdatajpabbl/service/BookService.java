package com.jetdev.springdatajpabbl.service;

import com.jetdev.springdatajpabbl.dto.out.BookCardView;
import com.jetdev.springdatajpabbl.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.lang.Nullable;

import java.util.Date;

public interface BookService {
    Page<BookCardView> findAllBookCard(Pageable pageable, @Nullable Date from, @Nullable Date to);

    BookCardView findBookCardById(Long id);

    Page<Book> findAll(Pageable pageable, @Nullable Date from, @Nullable Date to);
}
