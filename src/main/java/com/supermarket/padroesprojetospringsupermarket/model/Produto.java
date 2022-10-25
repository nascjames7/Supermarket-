package com.supermarket.padroesprojetospringsupermarket.model;

import javax.persistence.*;

@Entity
public class Produto {

    @Id//Chave da entidade.

    private Long codigo;
    private String nome;
    public Produto() {
    }

    public Produto(Long codigo, String nome) {

        this.codigo = codigo;
        this.nome = nome;
    }

    //Altera o nome do produto.
    public void mudarNome(String nome){

        this.setNome(nome);
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}