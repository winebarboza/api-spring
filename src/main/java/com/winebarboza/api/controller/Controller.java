package com.winebarboza.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.winebarboza.api.model.Pessoa;

import org.springframework.web.bind.annotation.RequestMapping;
import com.winebarboza.api.controller.MyService.*;

@RestController
@RequestMapping

public class Controller {
	//private List<Pessoa> pessoas = new ArrayList<>();
	@Autowired
	private MyService MyService;
	@GetMapping("/clientes")
	
	public List<Pessoa> getPessoas() {
		  return MyService.getPessoas();
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
	 @PostMapping("/inserir")
	    public ResponseEntity<Pessoa> addPessoa(@RequestBody Pessoa pessoa) {
	        MyService.addPessoa(pessoa);
	        return ResponseEntity.ok(pessoa);
	    }
}
