package com.example.demo.repository.relational.nonreactive;

import com.example.demo.model.Result;
import java.util.Objects;

//@Entity
//@Table(name = "result")
//public class ResultEntity {
//
//    @Id
//    @GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
//    private Long id;
//    private Integer result;
//
//    public Result() {
//    }
//
//    public Result(Integer result) {
//        this.result = result;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Integer getResult() {
//        return result;
//    }
//
//    public void setResult(Integer result) {
//        this.result = result;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Result result1 = (Result) o;
//        return Objects.equals(id, result1.id) && Objects.equals(result, result1.result);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, result);
//    }
//
//    @Override
//    public String toString() {
//        return "Result{" +
//                "id=" + id +
//                ", result=" + result +
//                '}';
//    }
//}
