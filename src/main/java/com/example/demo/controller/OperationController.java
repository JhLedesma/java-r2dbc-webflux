package com.example.demo.controller;

import com.example.demo.controller.dto.OperationInput;
import com.example.demo.model.Result;
import com.example.demo.service.OperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/operations")
public class OperationController {

    private OperationService operationService;

    @Autowired
    public OperationController(OperationService operationService) {
        this.operationService = operationService;
    }

    @PostMapping("/addition")
    public Mono<Result> add(@RequestBody OperationInput operationInput) {
        return operationService.add(operationInput);
    }

    @PostMapping("/subtraction")
    public Mono<Result> subtract(@RequestBody OperationInput operationInput) {
        return operationService.subtract(operationInput);
    }

    @PostMapping("/multiplication")
    public Mono<Result> multiply(@RequestBody OperationInput operationInput) {
        return operationService.multiply(operationInput);
    }

    @PostMapping("/division")
    public Mono<Result> divide(@RequestBody OperationInput operationInput) {
        return operationService.divide(operationInput);
    }
}