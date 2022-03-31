package com.fuyoo.adminauth;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fuyoo.adminauth.mapper")
public class AdminauthApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminauthApplication.class, args);
    }

}
