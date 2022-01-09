package com.mongo.controller;

import com.mongo.model.Produto;
import com.mongo.service.ProdutoService;
import com.mongo.service.SetorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/produtos")
public class ProdutoController {


    @Autowired
    private ProdutoService service;

    @Autowired
    private SetorService setorService;

    @GetMapping
    public List<Produto> buscarTodosProdutos() {

        return service.buscarTodosProdutos();
    }

    @GetMapping("/{codigo}")
    public Produto buscarProdutoById(@PathVariable String codigo) {
        return service.buscarProdutoByCodigo(codigo);
    }

    @PostMapping
    public Produto criarProduto(@RequestBody Produto produto) {
        produto.setSetor(setorService.buscarSetorPorId(produto.getSetor().getCodigo()));
        return service.criarProduto(produto);
    }

    @GetMapping("/range")
    public List<Produto> buscarProdutosPorRangeDePrecos(@RequestParam("precoDe") Integer precoDe, @RequestParam("precoAte") Integer precoAte) {
        return service.buscarProdutosPorRangeDePrecos(precoDe, precoAte);
    }

}
