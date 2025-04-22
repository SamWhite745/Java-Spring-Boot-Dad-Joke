package com.sam.dadjokerepo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DadJokeTest {
    private DadJoke dadJoke;

    @BeforeEach
    public void setUp() {
        dadJoke = new DadJoke("This is a Dad Joke");
    }

    @Test
    void getJokeTest() {
        assertEquals("This is a Dad Joke", dadJoke.getJoke());
    }

    @Test
    void getIdTest() {
        assertEquals(0, dadJoke.getId());
    }

    @Test
    void toStringTest() {
        assertEquals("id=0, This is a Dad Joke", dadJoke.toString());
    }
}
