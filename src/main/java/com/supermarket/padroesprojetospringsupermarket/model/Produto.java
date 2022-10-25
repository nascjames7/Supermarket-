package com.supermarket.padroesprojetospringsupermarket.model;

import javax.persistence.*;

@Entity
public class Produto {

    @Id//Chave da entidade.
    @GeneratedValue(strategy = GenerationType.AUTO)// Chave gerada automaticamente.
    private int codigo;
    private String nome;
    public Produto() {
    }

    public Produto(int codigo, String nome) {

        this.codigo = codigo;
        this.nome = nome;
    }

    //Altera o nome do produto.
    public void mudarNome(String nome){

        this.setNome(nome);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}