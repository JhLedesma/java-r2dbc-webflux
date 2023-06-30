package com.example.demo.repository.relational.reactive;

import com.example.demo.model.Result;
import com.example.demo.repository.ResultRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service @Qualifier("ReactiveRelational")
public class ResultReactiveRepositoryAdapter implements ResultRepository {

    private ResultReactiveDao resultReactiveDao;
    private ModelMapper modelMapper;

    @Autowired
    public ResultReactiveRepositoryAdapter(ResultReactiveDao resultReactiveDao, ModelMapper modelMapper) {
        this.resultReactiveDao = resultReactiveDao;
        this.modelMapper = modelMapper;
    }

    @Override
    public Mono<Result> save(Result result) {
        return resultReactiveDao.save(modelMapper.map(result, ResultReactiveEntity.class))
                .map(resultReactiveEntity -> modelMapper.map(resultReactiveEntity, Result.class));
    }

    @Override
    public Mono<Result> findById(String id) {
        return resultReactiveDao.findById(id)
                .map(resultReactiveEntity -> modelMapper.map(resultReactiveEntity, Result.class));
    }

    @Override
    public Flux<Result> findAll() {
        return resultReactiveDao.findAll()
                .map(resultReactiveEntity -> modelMapper.map(resultReactiveEntity, Result.class));
    }
}
