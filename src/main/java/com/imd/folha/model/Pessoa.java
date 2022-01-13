package com.imd.folha.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public abstract class Pessoa {
    
    @Id
    private Integer id;
    private String tipo;
    private String nome;
    private String telefone;
    private String email;
    private Endereco endereço;
    
    public Pessoa(Integer id, String tipo, String nome, String telefone, String email, Endereco endereço) {
        this.id = id;
        this.tipo = tipo;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.endereço = endereço;
    }
    public Pessoa() {
    }
    public String getNome() {
        return nome;
    }
    public String getTipo() {
        return tipo;
    }
    public String getEmail() {
        return email;
    }
    public String getTelefone() {
        return telefone;
    }
    public Endereco getEndereço() {
        return endereço;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setEndereço(Endereco endereço) {
        this.endereço = endereço;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

}
