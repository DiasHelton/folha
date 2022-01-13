package com.imd.folha.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contratado extends Pessoa{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String matricula;
    private String nome;
    private String cpf;
    private Endereco endereco;
    
    public Contratado() {
    }
    public Contratado(Integer id, String matricula, String nome, String cpf, Endereco endereco) {
        this.id = id;
        this.matricula = matricula;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    public String getMatricula() {
        return matricula;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    
   
}
