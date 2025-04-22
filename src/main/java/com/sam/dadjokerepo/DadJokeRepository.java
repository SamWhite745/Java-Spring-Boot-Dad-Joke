package com.sam.dadjokerepo;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "joke", path = "joke")
public interface DadJokeRepository extends JpaRepository<DadJoke, Integer> {}
