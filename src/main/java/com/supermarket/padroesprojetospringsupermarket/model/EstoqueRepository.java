package com.supermarket.padroesprojetospringsupermarket.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstoqueRepository extends CrudRepository<Estoque, Long> {
}
