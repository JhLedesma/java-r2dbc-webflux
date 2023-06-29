package com.example.demo.repository.relational.reactive;

import com.example.demo.model.Result;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.util.Objects;

@Table("result")
public class ResultReactiveEntity {

    @Id
    private Long id;
    private Integer result;

    public ResultReactiveEntity() {
    }

    public ResultReactiveEntity(Long id, Integer result) {
        this.id = id;
        this.result = result;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ResultReactiveEntity that = (ResultReactiveEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(result, that.result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, result);
    }
}
