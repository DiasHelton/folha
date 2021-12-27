package com.imd.folha.model;


public class Lancamento {
    private String descricao;
    private Float valor;
    
    public Lancamento(){

    }
    public Lancamento(String descricao2, Float valor2) {
    }
    public String getDescricao() {
        return descricao;
    }
    public Float getValor() {
        return valor;
    }
    public void setValor(Float valor) {
        this.valor = valor;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
}
