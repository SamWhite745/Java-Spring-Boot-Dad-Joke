package com.sam.dadjokerepo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

import java.util.List;
import java.util.Random;

@Controller
public class DadJokeController {

    private final DadJokeRepository repository;

    public DadJokeController(DadJokeRepository repository) {this.repository = repository;}

    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("randomJoke", getRandomDadJoke());
        return "joke";
    }

    DadJoke getRandomDadJoke() {
        List<DadJoke> dadJokeList = repository.findAll();
        Random random = new Random();
        return dadJokeList.get(random.nextInt(dadJokeList.size()));
    }
}
