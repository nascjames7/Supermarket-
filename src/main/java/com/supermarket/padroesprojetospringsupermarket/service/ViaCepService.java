package com.supermarket.padroesprojetospringsupermarket.service;

import com.supermarket.padroesprojetospringsupermarket.model.Endereco;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Client HTTP, criado via <b>OpenFeign</b>, para o consumo da API do
 * <b>ViaCEP</b>.
 *
 * @see <a href="https://spring.io/projects/spring-cloud-openfeign">Spring Cloud OpenFeign</a>
 * @see <a href="https://viacep.com.br">ViaCEP</a>
 *
 * @author falvojr
 */

@FeignClient(name="viacep", url = "https://www.viacep.com.br/ws")//URL base para obter as informações do cep.
public interface ViaCepService {

    @GetMapping("/{cep}/json/")//Método que busca o JSON, que é converte no endereço populado.
    Endereco consultarCep(@PathVariable("cep")String cep);
}
