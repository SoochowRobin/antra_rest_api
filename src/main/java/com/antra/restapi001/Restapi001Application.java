package com.antra.restapi001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class Restapi001Application {

    public static void main(String[] args) {

        SpringApplication.run(Restapi001Application.class, args);



    }

}
