package com.mongo.repository;

import com.mongo.model.Setor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SetorRepository extends MongoRepository<Setor, String> {
}
