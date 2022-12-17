package com.example.kis_db_proj;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.kis_db_proj.mapper"})
@MapperScan("com.example.kis_db_proj.mapper")
public class KisDbProjApplication {
    public static void main(String[] args) {
        SpringApplication.run(KisDbProjApplication.class, args);
    }
}
