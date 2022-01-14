package com.imd.folha.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pessoa {
    
    @Id
    private Integer id;
    private String pessoaTipo;
    private String nome;
    private String telefone;
    private String email;
    private Endereco endereço;
   
    public Pessoa() {
    }
    public String getPessoaTipo() {
        return pessoaTipo;
    }
    public void setPessoaTipo(String pessoaTipo) {
        this.pessoaTipo = pessoaTipo;
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
        return endereço;
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
