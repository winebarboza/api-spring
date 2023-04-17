package com.winebarboza.api.controller.MyService;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.winebarboza.api.model.Pessoa;

import jakarta.annotation.PostConstruct;


@Service
public class MyService {
    private List<Pessoa> pessoas = new ArrayList<>();
    @PostConstruct
    public void todasPessoas() {
    	//iniciando lista
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
         pessoas.add(new Pessoa(11, "Marcelo", 32, 'M', "(11) 3333-3333"));
    }
    public List<Pessoa> getPessoas() {
        return pessoas;
    }
   
	public void addPessoa(Pessoa pessoa) {
		 pessoas.add(pessoa);
	}
}
