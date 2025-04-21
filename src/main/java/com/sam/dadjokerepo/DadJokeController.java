package com.sam.dadjokerepo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class DadJokeController {

    private final DadJokeRepository repository;

    public DadJokeController(DadJokeRepository repository) {this.repository = repository;}

    @GetMapping("/")
    String getRandomDadJoke() {
        List<DadJoke> dadJokeList = repository.findAll();
        Random random = new Random();
        return dadJokeList.get(random.nextInt(dadJokeList.size())).toString();
    }
}
