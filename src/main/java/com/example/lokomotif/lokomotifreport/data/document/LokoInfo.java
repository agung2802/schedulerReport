package com.example.lokomotif.lokomotifreport.data.document;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document("posts")
public class LokoInfo {
    
    @Id
    private String id;

    private String kodeLoko;
    
    private String namaLoko;
    
    private String dimensiLoko;
    
    private Integer status;
    
    private String tanggal;
    
    private String jam;
}
