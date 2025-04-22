package com.sam.dadjokerepo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@WebMvcTest(DadJokeController.class)
public class DadJokeControllerTest {

    @MockitoBean
    private DadJokeRepository dadJokeRepository;

    @Test
    void shouldReturnDadJoke() {
        List<DadJoke> dadJokeList = new ArrayList<>();
        dadJokeList.add(new DadJoke("This is a Dad Joke"));
        DadJokeController dadJokeController = new DadJokeController(this.dadJokeRepository);

        when(this.dadJokeRepository.findAll()).thenReturn(dadJokeList);

        assertEquals("id=0, This is a Dad Joke", dadJokeController.getRandomDadJoke());
    }
}
