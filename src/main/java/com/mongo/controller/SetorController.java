package com.mongo.controller;

import com.mongo.model.Setor;
import com.mongo.service.SetorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/setores")
public class SetorController {

    @Autowired
    private SetorService setorService;

    @PostMapping
    public Setor criarSetor(@RequestBody Setor setor) {
        return setorService.salvarSetor(setor);
    }
}
