package com.example.kis_db_proj.model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataStorage {

    private final List<TmVag> tmVagList = new ArrayList<>();

    public List<TmVag> getTmVagList() {
        return tmVagList;
    }
}
