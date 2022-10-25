package com.supermarket.padroesprojetospringsupermarket.service;

import com.supermarket.padroesprojetospringsupermarket.model.Produto;
import org.springframework.stereotype.Service;

/**
 * Implementação da <b>strategy</b> {@link ProdutoService}, a qual pode ser injetada pelo Spring,
 * (via {@linkAutowired}). Com isso, como essa classe é um {@link ProdutoService}, ela será tratada
 * como um Singleton.
 */

@Service
public class ProdutoServiceImpl implements ProdutoService{
    @Override
    public Iterable<Produto> buscarTodos() {
        return null;
    }

    @Override
    public Produto buscarByCodigo(Long codigo) {
        return null;
    }

    @Override
    public void inserir(Produto produto) {

    }

    @Override
    public void atualizar(Long codigo, Produto produto) {

    }

    @Override
    public void deletar(Long codigo) {

    }
}
