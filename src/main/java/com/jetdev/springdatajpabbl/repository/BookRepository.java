package com.jetdev.springdatajpabbl.repository;

import com.jetdev.springdatajpabbl.entity.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>, QuerydslPredicateExecutor<Book> {
    <T> T findById(Long id, Class<T> type);

    <T> Page<T> findBy(Pageable pageable, Class<T> type);
}
