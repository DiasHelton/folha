package com.imd.folha.model;

public class Pessoa {
    
    private String nome;
    private String telefone;
    private String email;
    private Endereco endereco;
   
    public Pessoa() {
    }
  
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefone() {
        return telefone;
    }
    public Endereco getEndereço() {
        return endereco;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
