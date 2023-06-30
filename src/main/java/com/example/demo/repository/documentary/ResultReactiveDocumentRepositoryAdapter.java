package com.example.demo.repository.documentary;

import com.example.demo.model.Result;
import com.example.demo.repository.ResultRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service @Qualifier("ReactiveDocumentary")
public class ResultReactiveDocumentRepositoryAdapter implements ResultRepository {

    private ResultDocumentaryDao resultDocumentaryDao;
    private ModelMapper modelMapper;

    @Autowired
    public ResultReactiveDocumentRepositoryAdapter(ResultDocumentaryDao resultDocumentaryDao, ModelMapper modelMapper) {
        this.resultDocumentaryDao = resultDocumentaryDao;
        this.modelMapper = modelMapper;
    }

    @Override
    public Mono<Result> save(Result result) {
        return resultDocumentaryDao.save(modelMapper.map(result, ResultReactiveDocument.class))
                .map(resultReactiveDocument -> modelMapper.map(resultReactiveDocument, Result.class));
    }

    @Override
    public Mono<Result> findById(String id) {
        return resultDocumentaryDao.findById(id)
                .map(resultReactiveDocument -> modelMapper.map(resultReactiveDocument, Result.class));
    }

    @Override
    public Flux<Result> findAll() {
        return resultDocumentaryDao.findAll()
                .map(resultReactiveDocument -> modelMapper.map(resultReactiveDocument, Result.class));
    }
}
