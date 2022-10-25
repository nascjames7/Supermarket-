package com.supermarket.padroesprojetospringsupermarket.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Estoque {

    @Id
    @ManyToOne
    /*Produto apresenta um estoque determinado, mas o mesmo tipo de estoque
     pode ter outros produtos.*/
    private Produto produto;
    private int quantidadeAtual;
    private int quantidadeMinima;

    public Estoque() {}

    public Estoque(Produto produto, int quantidadeAtual, int quantidadeMinima) {
        this.produto = produto;
        this.quantidadeAtual = quantidadeAtual;
        this.quantidadeMinima = quantidadeMinima;
    }
}
