package com.mongo.service;

import com.mongo.model.Produto;
import com.mongo.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public List<Produto> buscarTodosProdutos() {
        return produtoRepository.findAll();
    }

    public Produto buscarProdutoByCodigo(String codigo) {
        return produtoRepository.findById(codigo).orElseThrow(() -> new IllegalArgumentException("Produto não encontrado"));
    }

    public Produto criarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    public List<Produto> buscarProdutosPorRangeDePrecos(Integer precoDe, Integer precoAte) {
        return produtoRepository.buscarProdutosPorRangeDePrecos(precoDe, precoAte);
    }
}
