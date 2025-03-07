package com.example.dagitikSistemler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EnableRedisRepositories
public class DagitikSistemlerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DagitikSistemlerApplication.class, args);
    }

}
