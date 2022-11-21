package com.jetdev.springdatajpabbl.service.impl;

import com.jetdev.springdatajpabbl.dto.out.SeriesDetailView;
import com.jetdev.springdatajpabbl.repository.SeriesRepository;
import com.jetdev.springdatajpabbl.service.SeriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class SeriesServiceImpl implements SeriesService {

    private final SeriesRepository repository;

    @Override
    public List<SeriesDetailView> findAll() {
        return this.repository.findBy(SeriesDetailView.class);
    }

    @Override
    public SeriesDetailView findById(Long id) {
        return this.repository.findById(id, SeriesDetailView.class);
    }
}
