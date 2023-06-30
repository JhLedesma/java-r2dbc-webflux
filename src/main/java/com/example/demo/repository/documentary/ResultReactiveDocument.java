package com.example.demo.repository.documentary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "result")
public class ResultReactiveDocument {
    @Id
    private String id;
    private Integer result;
}
