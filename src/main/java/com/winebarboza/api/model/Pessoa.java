package com.winebarboza.api.model;

public class Pessoa {
    private Long id;
    private String nome;
    private int idade;
    private char sexo;
    private String telefone;

    public Pessoa(int id, String nome, int idade, char sexo, String telefone) {
        this.id = (long) id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.telefone = telefone;
    }

    public Long getId() {
        return id;
    }

    public void setId(long i) {
        this.id = (long) i;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
