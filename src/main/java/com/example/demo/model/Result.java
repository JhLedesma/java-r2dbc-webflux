package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Result {

    private String id;
    private Integer result;

    public Result(Integer result) {
        this.id = UUID.randomUUID().toString().replace("-", "");
        this.result = result;
    }
}