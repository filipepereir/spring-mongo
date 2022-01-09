package com.mongo.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Setor {

    @Id
    private String codigo;
    private String nome;
    private String responsavel;
}
