package com.activeedge.test;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class TestApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
//            new StockService().createAllStocks();
      //  StockService stockService = new StockService();




    }
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
