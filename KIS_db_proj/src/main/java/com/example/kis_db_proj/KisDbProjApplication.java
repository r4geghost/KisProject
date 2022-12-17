package com.example.kis_db_proj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication(scanBasePackages = {"com.example.kis_db_proj"})
@MapperScan("com.example.kis_db_proj.mapper")
@EnableScheduling
public class KisDbProjApplication {
    public static void main(String[] args) {
        SpringApplication.run(KisDbProjApplication.class, args);
    }
}
