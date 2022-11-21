package com.jetdev.springdatajpabbl.service.impl;

import com.jetdev.springdatajpabbl.dto.out.BookCardView;
import com.jetdev.springdatajpabbl.entity.Book;
import com.jetdev.springdatajpabbl.repository.BookRepository;
import com.jetdev.springdatajpabbl.service.BookService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

import static com.jetdev.springdatajpabbl.helper.BookSpecificationHelper.publicationDateBetweenQuery;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class BookServiceImpl implements BookService {

    private final BookRepository repository;

    @Override
    public Page<Book> findAll(Pageable pageable, @Nullable Date from, @Nullable Date to) {
        return Page.empty();
    }

    @Override
    public Page<BookCardView> findAllBookCard(Pageable pageable, @Nullable Date from, @Nullable Date to) {
        return this.repository.findBy(publicationDateBetweenQuery(from, to), r -> r.as(BookCardView.class).page(pageable));
    }

    @Override
    public BookCardView findBookCardById(Long id) {
        return this.repository.findById(id, BookCardView.class);
    }
}
