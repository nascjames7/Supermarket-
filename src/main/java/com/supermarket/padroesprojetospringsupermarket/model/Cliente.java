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
}
