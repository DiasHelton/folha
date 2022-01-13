package com.imd.folha.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Lancamento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String descricao;
    private Float valor;
    
    public Lancamento() {
    }
    public Lancamento(Integer id, String descricao, Float valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
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
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    
}
