package com.example.lokomotif.lokomotifreport.data.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Builder
@Entity
@Table(name = "infoloko")
public class LokoSummaryInfo {
    
    @Id
    private String id;

    @Column(name = "kodeloko")
    private String kodeLoko;
    
    @Column(name = "namaloko")
    private String namaLoko;

    @Column(name = "dimensiloko")
    private String dimensiLoko;

    private Integer status;

    private String tanggal;
    
    private String jam;
}
