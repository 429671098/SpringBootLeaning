package com.example.springbootmongodb;

import com.example.springbootmongodb.dao.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootMongodbApplication {
    @Autowired
    CustomerRepository customerRepository;


    public static void main(String[] args) {
        SpringApplication.run(SpringbootMongodbApplication.class, args);
    }

    public void run(String... args) throws Exception {
        customerRepository.deleteAll();
    }

}
