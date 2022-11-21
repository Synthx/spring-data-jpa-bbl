package com.jetdev.springdatajpabbl.repository;

import com.jetdev.springdatajpabbl.entity.Series;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeriesRepository extends JpaRepository<Series, Long> {
    <T> List<T> findBy(Class<T> type);

    <T> T findById(Long id, Class<T> type);
}
