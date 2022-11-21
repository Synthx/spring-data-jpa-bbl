package com.jetdev.springdatajpabbl.dto.out;

import org.springframework.beans.factory.annotation.Value;

public interface SeriesDetailView {
    Long getId();

    String getName();

    @Value("#{target.books.size()}")
    Long getBookCount();
}
