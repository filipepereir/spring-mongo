package com.mongo.repository;

import com.mongo.model.Produto;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProdutoRepository extends MongoRepository<Produto, String> {

    @Query("{ $and: [{ 'preco' : { $gte : ?0 } }, { 'preco' : { $lte : ?1 } } ] }")
    List<Produto> buscarProdutosPorRangeDePrecos(Integer de, Integer ate);
}
