package com.sam.dadjokerepo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DadJokeRepoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DadJokeRepoApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(DadJokeRepository repository) {
        return args -> {
            repository.save(new DadJoke("This is joke 1"));
            repository.save(new DadJoke("This is joke 2"));
            repository.save(new DadJoke("This is joke 3"));
        };
    }
}
