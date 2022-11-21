package com.jetdev.springdatajpabbl.helper;

import com.jetdev.springdatajpabbl.entity.Book;
import com.jetdev.springdatajpabbl.entity.Book_;
import com.jetdev.springdatajpabbl.entity.QBook;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import com.querydsl.core.types.dsl.DateTimePath;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.Nullable;

import java.util.Date;

public final class BookSpecificationHelper {
    public static Specification<Book> publicationDateBetween(@Nullable Date from, @Nullable Date to) {
        return (root, query, cb) -> {
            if (from == null && to == null) {
                return cb.and();
            }
            if (from == null) {
                return cb.lessThanOrEqualTo(root.get(Book_.publicationDate), to);
            }
            if (to == null) {
                return cb.greaterThanOrEqualTo(root.get(Book_.publicationDate), from);
            }

            return cb.between(root.get(Book_.publicationDate), from, to);
        };
    }

    public static Predicate publicationDateBetweenQuery(@Nullable Date from, @Nullable Date to) {
        if (from == null && to == null) {
            return new BooleanBuilder();
        }

        final DateTimePath<Date> publicationDate = QBook.book.publicationDate;
        if (from == null) {
            return publicationDate.loe(to);
        }
        if (to == null) {
            return publicationDate.goe(from);
        }

        return publicationDate.between(from, to);
    }
}
