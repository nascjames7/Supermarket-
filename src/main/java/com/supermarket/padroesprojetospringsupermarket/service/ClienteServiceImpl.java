package com.supermarket.padroesprojetospringsupermarket.service;

import com.supermarket.padroesprojetospringsupermarket.model.Cliente;
import com.supermarket.padroesprojetospringsupermarket.model.Produto;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService{
    @Override
    public Iterable<Cliente> buscarTodos() {
        return null;
    }

    @Override
    public Produto buscarById(Long id) {
        return null;
    }

    @Override
    public void inserir(Cliente cliente) {

    }

    @Override
    public void atualizar(Long id, Cliente cliente) {

    }

    @Override
    public void deletar(Long id) {

    }
}
