package com.supermarket.padroesprojetospringsupermarket.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

@Entity
public class Estoque {

    @Id
    private Long id;
    @ManyToOne
    @JoinColumn(name = "produto_codigo")
    private Produto produto;
    private int quantidadeAtual;
    private int quantidadeMinima;

    public Estoque() {}

    public Estoque(Long id, Produto produto, int quantidadeAtual, int quantidadeMinima) {
        this.id = id;
        this.produto = produto;
        this.quantidadeAtual = quantidadeAtual;
        this.quantidadeMinima = quantidadeMinima;
    }

    //Altera a quantidade mínima.
    public void mudarQtdMinima(int qtdMinima){

        this.setQuantidadeMinima(qtdMinima);
    }

    //Adiciona 10 unidades de produto a qauntidade atual do mesmo.
    public void reporEstoque(){

        this.setQuantidadeAtual(quantidadeAtual + 10);
    }

    //Subtrai certe quantidade de produto do estoque.
    public void darBaixa(int qtdRetirada){

        this.setQuantidadeAtual(quantidadeAtual - qtdRetirada);
    }

    //Descreve a quantidade atual de um determinado produto.
    public void relatorio(Estoque estoque){

        System.out.println(LocalDate.now());
        System.out.println("Codigo do estoque: " + this.getId());
        System.out.println("Produto/(cod): " + this.produto.getNome() + "/" + this.produto.getCodigo());
        System.out.println("Quantidade Atual: " + this.getQuantidadeAtual());
        System.out.println("Quantidade Mínima: " + this.getQuantidadeMinima());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidadeAtual() {
        return quantidadeAtual;
    }

    public void setQuantidadeAtual(int quantidadeAtual) {
        this.quantidadeAtual = quantidadeAtual;
    }

    public int getQuantidadeMinima() {
        return quantidadeMinima;
    }

    public void setQuantidadeMinima(int quantidadeMinima) {
        this.quantidadeMinima = quantidadeMinima;
    }
}
