package com.imd.folha.model;

public class Endereco {
    private String nomeRua;
    private String numero;
    private String cep;
    private String bairro;
    private String cidade;
    private String estado;
    private String pais;
    
    public String getNomeRua() {
        return nomeRua;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public String getBairro() {
        return bairro;
    }
    public void setBairro(String bairro) {
        this.bairro = bairro;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public void setNomeRua(String nomeRua) {
        this.nomeRua = nomeRua;
    }
}
