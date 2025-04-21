package com.sam.dadjokerepo;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.hateoas.RepresentationModel;

@Entity
public class DadJoke extends RepresentationModel<DadJoke> {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    private String joke;

    protected DadJoke() {}

    @JsonCreator
    public DadJoke(@JsonProperty("joke") String joke){
        this.joke = joke;
    }

    public String getJoke(){
        return joke;
    }

    public int getId(){
        return id;
    }

    @Override
    public String toString() {
        return "id=" + id + ", " + joke;
    }
}
