package com.example.kis_db_proj.controller;

import com.example.kis_db_proj.model.DataStorage;
import com.example.kis_db_proj.model.TmVag;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/kis")
public class MainController {
    @Autowired
    DataStorage dataStorage;

    @Operation(summary = "Список вагонов",
    description = "Сервис возвращает список вагонов из базы данных")
    @GetMapping(value = "/vagons", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<TmVag> getVagons() {
        return dataStorage.getTmVagList();
    }

}
