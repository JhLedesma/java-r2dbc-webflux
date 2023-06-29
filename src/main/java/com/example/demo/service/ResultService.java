package com.example.demo.service;

import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Result;
import com.example.demo.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ResultService {

    private ResultRepository resultRepository;

    @Autowired
    public ResultService(@Qualifier("ReactiveRelational") ResultRepository resultRepository) {
        this.resultRepository = resultRepository;
    }

    public Mono<Result> save(Result result) {
        return resultRepository.save(result);
    }

    public Mono<Result> findById(Long id) {
        return resultRepository.findById(id).switchIfEmpty(Mono.error(new ResourceNotFoundException("Result not found with id " + id)));
    }

    public Flux<Result> findAll() {
        return resultRepository.findAll();
    }
}
