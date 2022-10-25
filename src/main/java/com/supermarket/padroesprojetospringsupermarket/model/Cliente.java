package com.supermarket.padroesprojetospringsupermarket.model;

import javax.persistence.*;

@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)// Chave gerada automaticamente.
    private Long id;
    private String nome;
    @ManyToOne//um clienete terá um endereço, mas um endereço pode ser usado para vários clientes.
    private Endereco endereco;

    public Cliente() {
    }

    public Cliente(Long id, String nome, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
