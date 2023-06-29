package com.example.demo.repository;

import com.example.demo.model.Result;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ResultRepository {

    Mono<Result> save(Result result);
    Mono<Result> findById(Long id);
    Flux<Result> findAll();
}
