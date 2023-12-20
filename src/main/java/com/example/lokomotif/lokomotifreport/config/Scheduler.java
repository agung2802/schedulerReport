package com.example.lokomotif.lokomotifreport.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
// import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.lokomotif.lokomotifreport.data.document.LokoInfo;
import com.example.lokomotif.lokomotifreport.data.entity.LokoSummaryInfo;
import com.example.lokomotif.lokomotifreport.repository.mongodb.LokoRepository;
import com.example.lokomotif.lokomotifreport.repository.mysql.SummaryRepository;


@Service
public class Scheduler {

    @Autowired
    private LokoRepository lokoRepository;
    
    @Autowired
    private SummaryRepository summaryRepository;

    // @Autowired
    // private TelegramBot telegramBot;
    
    @Scheduled(fixedDelay = 10000)
    public void migrationData(){

        List<LokoInfo> lokoInfo = lokoRepository.findAll();
        
        for (LokoInfo data : lokoInfo) {
            boolean existingLoko = summaryRepository.existsById(data.getId());
            if (!existingLoko) {
                LokoSummaryInfo summaryInfo = LokoSummaryInfo.builder()
                    .id(data.getId().toString())
                    .namaLoko(data.getNamaLoko())
                    .kodeLoko(data.getKodeLoko())
                    .dimensiLoko(data.getDimensiLoko())
                    .status(data.getStatus())
                    .tanggal(data.getTanggal())
                    .jam(data.getJam())
                    .build();

                summaryRepository.save(summaryInfo);

                // telegramBot.sendMessage(
                //     String.format("""
                //     ==== Summary Lokomotif Update ====

                //     Nama Loko Motif = %d
                //     Dimensi Lokomotif = %d
                //     Status Lokomotif = %d
                //     """, data.getNamaLoko(), data.getDimensiLoko(),
                //     data.getStatus())
                // );
            }
        }
    }
}
