package com.example.demo.service;

import com.example.demo.controller.dto.OperationInput;
import com.example.demo.model.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;


@Service
public class OperationService {

    private ResultService resultService;

    @Autowired
    public OperationService(ResultService resultService) {
        this.resultService = resultService;
    }

    public Mono<Result> add(OperationInput operationInput) {
        Integer operationResult = operationInput.getA() + operationInput.getB();
        return getResult(operationResult);
    }

    public Mono<Result> subtract(OperationInput operationInput) {
        Integer operationResult = operationInput.getA() + operationInput.getB();
        return getResult(operationResult);
    }

    public Mono<Result> multiply(OperationInput operationInput) {
        Integer operationResult = operationInput.getA() * operationInput.getB();
        return getResult(operationResult);
    }

    public Mono<Result> divide(OperationInput operationInput) {
        Integer operationResult = operationInput.getA() / operationInput.getB(); //TODO: handle division by zero
        return getResult(operationResult);
    }

    private Mono<Result> getResult(Integer operationResult) {
        return Mono.just(new Result(operationResult)).flatMap(resultService::save);
    }
}
