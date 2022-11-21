package com.jetdev.springdatajpabbl.controller;

import com.jetdev.springdatajpabbl.dto.out.SeriesDetailView;
import com.jetdev.springdatajpabbl.service.SeriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("series")
public class SeriesController {

    private final SeriesService service;

    @GetMapping
    public List<SeriesDetailView> findAll() {
        return this.service.findAll();
    }

    @GetMapping("{id}")
    public SeriesDetailView findById(@PathVariable Long id) {
        return this.service.findById(id);
    }
}
