package com.mongo.service;

import com.mongo.model.Setor;
import com.mongo.repository.SetorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SetorService {

    @Autowired
    private SetorRepository setorRepository;

    public Setor buscarSetorPorId(String id) {
        return setorRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Setor não encontrado"));
    }

    public Setor salvarSetor(Setor setor) {
        return setorRepository.save(setor);
    }

}
