package com.example.lokomotif.lokomotifreport.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lokomotif.lokomotifreport.data.document.LokoInfo;
import com.example.lokomotif.lokomotifreport.data.entity.LokoSummaryInfo;
import com.example.lokomotif.lokomotifreport.repository.mongodb.LokoRepository;
import com.example.lokomotif.lokomotifreport.repository.mysql.SummaryRepository;

@Service
public class SummaryLokoService {
    
    @Autowired
    private SummaryRepository summaryRepository;

    @Autowired
    private LokoRepository lokoRepository;

    public List<LokoSummaryInfo> getAll() {

        return summaryRepository.findAll();
        
    }

    public List<LokoInfo> getAllMongo() {
        return lokoRepository.findAll();
    }
}
