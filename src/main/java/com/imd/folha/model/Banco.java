package com.imd.folha.model;

public class Banco {
    private String nome;
    private String cnpj;
    
    public String getNome() {
        return nome;
    }
    public String getCNPJ() {
        return cnpj;
    }
    public void setCNPJ(String cnpj) {
        this.cnpj = cnpj;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
