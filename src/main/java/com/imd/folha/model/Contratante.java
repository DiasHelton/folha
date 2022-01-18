package com.imd.folha.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contratante extends Pessoa{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String razao;
    private String cnpj;
    
    public Contratante() {
    }
    
    public Contratante(Integer id, String razao, String cnpj, String nome, String telefone, String email, Endereco endereco) {
        this.id = id;
        this.razao = razao;
        this.cnpj = cnpj;
        super.setNome(nome);
        super.setTelefone(telefone);
        super.setEmail(email);
        super.setEndereco(endereco);
    }
    
    public String getRazao() {
        return razao;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public void setRazao(String razao) {
        this.razao = razao;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
}
