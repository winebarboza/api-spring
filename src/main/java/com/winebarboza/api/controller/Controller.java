package com.winebarboza.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.winebarboza.api.model.Pessoa;

import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping

public class Controller {
	
	@GetMapping("/clientes")
	
	public List<Pessoa> getPessoas() {
		 List<Pessoa> pessoas = new ArrayList<Pessoa>();
        pessoas.add(new Pessoa(1, "João", 30, 'M', "(11) 1111-1111"));
        pessoas.add(new Pessoa(2, "Maria", 25, 'F', "(11) 2222-2222"));
        pessoas.add(new Pessoa(3, "Pedro", 40, 'M', "(11) 3333-3333"));
        pessoas.add(new Pessoa(4, "Wine", 22, 'F', "(11) 3333-3333"));
        pessoas.add(new Pessoa(5, "Jorge", 25, 'M', "(11) 3333-3333"));
        pessoas.add(new Pessoa(6, "Anfisa", 20, 'F', "(11) 3333-3333"));
        pessoas.add(new Pessoa(7, "Pamela", 20, 'F', "(11) 3333-3333"));
        pessoas.add(new Pessoa(8, "Cleitinho", 40, 'M', "(11) 3333-3333"));
        pessoas.add(new Pessoa(9, "Matheus", 44, 'M', "(11) 3333-3333"));
        pessoas.add(new Pessoa(10, "Fabricia", 50, 'F', "(11) 3333-3333"));
        return pessoas;
    }
	@GetMapping("/{id}")
	// @pathvariable para informar que está recebendo uma variável pela url
	public ResponseEntity<Pessoa> buscaId(@PathVariable Long id) {
	    for (Pessoa pessoa : getPessoas()) {
	        if (pessoa.getId() == id) {
	            return ResponseEntity.ok(pessoa);
	        }
	    }
	    return ResponseEntity.notFound().build();
	}
}
