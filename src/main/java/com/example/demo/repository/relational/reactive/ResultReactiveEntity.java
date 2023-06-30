package com.example.demo.repository.relational.reactive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.domain.Persistable;
import org.springframework.data.relational.core.mapping.Table;

@Table("result")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultReactiveEntity implements Persistable<String> {

    @Id
    private String id;
    private Integer result;
    @Transient
    private boolean isNew;

    @Override
    public boolean isNew() {
        return isNew || id == null;
    }

    public ResultReactiveEntity setAsNew() {
        isNew = true;
        return this;
    }
}
