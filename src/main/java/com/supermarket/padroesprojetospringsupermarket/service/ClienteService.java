package com.supermarket.padroesprojetospringsupermarket.service;

import com.supermarket.padroesprojetospringsupermarket.model.Cliente;
import com.supermarket.padroesprojetospringsupermarket.model.Produto;

/**
 * Interface que define o padrão <b>strategy</b> do domínio do produto. Com isso,
 * se necessário, podemos ter múltiplas implementações desta mesma interface.
 *
 * @Author James Anderson
 */


public interface ClienteService {

    Iterable<Cliente> buscarTodos();

    Cliente buscarById(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
