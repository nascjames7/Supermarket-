package com.supermarket.padroesprojetospringsupermarket.service;

import com.supermarket.padroesprojetospringsupermarket.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 */

@FeignClient(name="viacep", url = "https://www.viacep.com.br/ws")//URL base para obter as informações do cep.
public interface ViaCepService {

    @RequestMapping(method = RequestMethod.GET, value = "/{cep}/(json)/")//Método que busca o JSON, que é converte no endereço populado.
    Endereco consultarCep(@PathVariable("cep")String cep);
}
