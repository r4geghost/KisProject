package com.example.kis_db_proj.service;

import com.example.kis_db_proj.mapper.TmVagMapper;
import com.example.kis_db_proj.model.TmVag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RunWorkDbService {

    @Autowired
    TmVagMapper tmVagMapper;

    @Scheduled(fixedDelay = 10 * 24 * 60 * 60000)
    void run() {
        List<TmVag> tmVagList = tmVagMapper.selectAll();
    }
}
