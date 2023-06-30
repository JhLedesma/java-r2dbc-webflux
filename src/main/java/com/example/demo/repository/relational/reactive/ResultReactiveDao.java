package com.example.demo.repository.relational.reactive;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultReactiveDao extends ReactiveCrudRepository<ResultReactiveEntity, String> {
}