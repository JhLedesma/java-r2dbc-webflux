package com.example.demo.repository.relational.reactive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("result")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultReactiveEntity {

    @Id
    private String id;
    private Integer result;
}
