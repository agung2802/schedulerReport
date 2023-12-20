package com.example.lokomotif.lokomotifreport.repository.mysql;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.lokomotif.lokomotifreport.data.entity.LokoSummaryInfo;
import java.util.Optional;

@Repository
public interface SummaryRepository extends JpaRepository<LokoSummaryInfo, String>{
    Optional<LokoSummaryInfo> findById(String id);
}
