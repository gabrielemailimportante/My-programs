package com.curso.primeiroapp.controllers;


//Vamos trabalhar com anotações
//Anotações são códigos precendidos pelo símbolo @
//Todas as anotações devem vir antes do código que atuará

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//Anotações indica que uma classe será produtora de endpoints
@RestController
public class EndPointsController {

    //Criando o endpoint A
    //http://localhost:8080/end-a
    //Anotação para criar endpoint GET
    @GetMapping("/end-a")
    public String endpointA(){
        return "Bem vindo ao endpoint A";
    }

    @GetMapping("/end-b")
    public String endpointB(){
        return "Bem vindo ao endpoint B";
    }

    //Interpolando variavel de caminho
    //htpp://localhost:8080/hello/nome
    @GetMapping("/hello/{nome}")
    public String hello(@PathVariable String nome){
        return "Olá " + nome;
    }
}
