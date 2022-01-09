package com.mongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document
public class Produto {

    @Id
    private String codigo;
    private String nome;
    private Integer preco;
    @DBRef
    private Setor setor;

}
