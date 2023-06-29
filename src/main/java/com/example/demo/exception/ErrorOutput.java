package com.example.demo.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

@Data
@AllArgsConstructor
public class ErrorOutput {

    private Integer code;
    private String error;
    private String endpoint;
    private String message;
}
