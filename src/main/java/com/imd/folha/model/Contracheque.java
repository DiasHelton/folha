package com.imd.folha.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contracheque {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    private Contratante contratante;
    private Contratado contratado;
    private String periodoReferencia;
    private Lancamento[] lancamentos;
    private Float totalLiquido;
    
    public Contracheque() {
    }
    public Contracheque(Integer id, Contratante contratante, Contratado contratado, String periodoReferencia,
            Lancamento[] lancamentos, Float totalLiquido) {
        this.id = id;
        this.contratante = contratante;
        this.contratado = contratado;
        this.periodoReferencia = periodoReferencia;
        this.lancamentos = lancamentos;
        this.totalLiquido = totalLiquido;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getTotalLiquido() {
        return totalLiquido;
    }
    public void setTotalLiquido(Float totalLiquido) {
        this.totalLiquido = totalLiquido;
    }
    public Contratante getContratante() {
        return contratante;
    }
    public Lancamento[] getLancamentos() {
        return lancamentos;
    }
    public void setLancamentos(Lancamento[] lancamentos) {
        this.lancamentos = lancamentos;
    }
    public String getPeriodoReferencia() {
        return periodoReferencia;
    }
    public void setPeriodoReferencia(String periodoReferencia) {
        this.periodoReferencia = periodoReferencia;
    }
    public Contratado getContratado() {
        return contratado;
    }
    public void setContratado(Contratado contratado) {
        this.contratado = contratado;
    }
    public void setContratante(Contratante contratante) {
        this.contratante = contratante;
    }
    
    public Float calculaTotalLiquido(Lancamento[] lancam){
        Float total = 0f;
        for (int i = 0; i < lancam.length; i++){
            total += lancam[i].getValor();           
        }
        this.setTotalLiquido(total);
        return totalLiquido;
    }   
   
    //Métodos 

    // public void inserirLancamento(Lancamento n){
    
    //     Contracheque c  = Lancamento n;
    // }



    // public void excluirLancamento(){}
   

    //Brainstorm--------------------------------------------------------------------

        // public Float calculaLiquido(lancamentos){
    //     for (lancamentos l : lancamentos){
    //     totalLiquido = sum(lancamentos.getLancamento().getValor());
    //     }
    //     return totalLiquido;
    // }

    // public Float calculaTotalLiquido(Lancamento[] esses){
    //  this.setTotalLiquido(esses[0].getValor() + esses[1].getValor() + esses[2].getValor());   
    //  return totalLiquido;
    // }

}

