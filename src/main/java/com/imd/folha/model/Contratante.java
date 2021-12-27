package com.imd.folha.model;

public class Contratante {
    private String razao;
    private String nome;
    private String cnpj;
    private String endereco;
    
    public String getRazao() {
        return razao;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setRazao(String razao) {
        this.razao = razao;
    }
}
