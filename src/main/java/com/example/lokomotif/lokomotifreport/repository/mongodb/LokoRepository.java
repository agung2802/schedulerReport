package com.example.lokomotif.lokomotifreport.repository.mongodb;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.lokomotif.lokomotifreport.data.document.LokoInfo;

@Repository
public interface LokoRepository extends MongoRepository<LokoInfo, String> {
    
}
