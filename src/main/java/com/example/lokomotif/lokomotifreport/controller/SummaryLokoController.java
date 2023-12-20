package com.example.lokomotif.lokomotifreport.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.lokomotif.lokomotifreport.data.document.LokoInfo;
import com.example.lokomotif.lokomotifreport.data.entity.LokoSummaryInfo;
import com.example.lokomotif.lokomotifreport.service.SummaryLokoService;

@RestController
public class SummaryLokoController {
    
    @Autowired
    private SummaryLokoService summaryLokoService;

    @GetMapping(path = "/api/contacts", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<LokoSummaryInfo>> getSummaryLoko() {
        
        return ResponseEntity.ok(summaryLokoService.getAll());
    }

    @GetMapping(path = "/api/mongodb", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<LokoInfo>> getDataMongo() {
        return ResponseEntity.ok(summaryLokoService.getAllMongo());
    }
    
}
