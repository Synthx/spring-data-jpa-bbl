package com.jetdev.springdatajpabbl.service;

import com.jetdev.springdatajpabbl.dto.out.SeriesDetailView;

import java.util.List;

public interface SeriesService {
    List<SeriesDetailView> findAll();

    SeriesDetailView findById(Long id);
}
