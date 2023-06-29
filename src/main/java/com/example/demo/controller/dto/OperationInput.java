package com.example.demo.controller.dto;

import java.util.Objects;

public class OperationInput {
    private Integer a;
    private Integer b;

    public OperationInput() {
    }

    public OperationInput(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public Integer getA() {
        return a;
    }

    public void setA(Integer a) {
        this.a = a;
    }

    public Integer getB() {
        return b;
    }

    public void setB(Integer b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OperationInput that = (OperationInput) o;
        return Objects.equals(a, that.a) && Objects.equals(b, that.b);
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b);
    }

    @Override
    public String toString() {
        return "OperationInput{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
