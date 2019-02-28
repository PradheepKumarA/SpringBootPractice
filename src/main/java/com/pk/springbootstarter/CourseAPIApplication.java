package com.pk.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * CourseAPIApplication
 *
 * @author PradheepKumarA
 * @date 2019-02-28
 */
@SpringBootApplication
public class CourseAPIApplication {
    public static void main(String[] args) {
        System.getProperties().put("server.port", 80);

        SpringApplication.run(CourseAPIApplication.class, args);
    }
}
