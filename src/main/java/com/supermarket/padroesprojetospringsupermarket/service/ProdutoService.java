package com.supermarket.padroesprojetospringsupermarket.service;


import com.supermarket.padroesprojetospringsupermarket.model.Produto;

/**
 * Interface que define o padrão <b>strategy</b> do domínio do produto. Com isso,
 * se necessário, podemos ter múltiplas implementações desta mesma interface.
 */

public interface ProdutoService {

    Iterable<Produto> buscarTodos();

    Produto buscarByCodigo(Long codigo);

    void inserir(Produto produto);

    void atualizar(Long codigo, Produto produto);

    void deletar(Long codigo);
}
