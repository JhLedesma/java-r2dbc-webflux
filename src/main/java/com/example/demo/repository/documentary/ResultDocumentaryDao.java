package com.example.demo.repository.documentary;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResultDocumentaryDao extends ReactiveMongoRepository<ResultReactiveDocument, String> {

}
