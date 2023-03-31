package com.example.bookstoreback;

import com.example.bookstoreback.Services.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookStoreBackApplication implements CommandLineRunner {
    @Autowired
    LivreService livreService;

    public static void main(String[] args) {
        SpringApplication.run(BookStoreBackApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
