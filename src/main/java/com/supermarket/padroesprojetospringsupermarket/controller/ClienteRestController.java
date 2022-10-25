package com.supermarket.padroesprojetospringsupermarket.controller;

import com.supermarket.padroesprojetospringsupermarket.model.Cliente;
import com.supermarket.padroesprojetospringsupermarket.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * Esse {@link RestController}  representa nossa <b>Facade</b>, pois abstrai toda a complexidade
 * de integrações (Banco de Dados H2 e API do viaCEP) em um interface simples e coesa (API REST).
 */

@RestController
@RequestMapping("clientes")
public class ClienteRestController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping//Buscar todos.
    public ResponseEntity<Iterable<Cliente>> buscarTodos(){

        return ResponseEntity.ok(clienteService.buscarTodos());
    }

    @GetMapping("/{id}")//Buscar um cliente por id.
    public ResponseEntity<Cliente> buscarById(@PathVariable Long id){

        return ResponseEntity.ok(clienteService.buscarById(id));
    }

    @PostMapping//Incluir um cliente.
    public ResponseEntity<Cliente> inserir(@RequestBody Cliente cliente){

        clienteService.inserir(cliente);
        return ResponseEntity.ok(cliente);
    }

    @PutMapping("/{id}")//Alterar os dados de um cliente.
    public ResponseEntity<Cliente> atualizar(@PathVariable Long id, @RequestBody Cliente cliente){

        clienteService.atualizar(id, cliente);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{id}")//Excluir os dados de um cliente.
    public ResponseEntity<Void> deletar(@PathVariable Long id){

        clienteService.deletar(id);
        return ResponseEntity.ok().build();
    }


}
