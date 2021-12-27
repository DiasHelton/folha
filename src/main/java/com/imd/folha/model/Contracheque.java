package com.imd.folha.model;

public class Contracheque {
    
    private Contratante contratante;
    private Contratado contratado;
    private String periodoReferencia;
    private Lancamento[] lancamentos;
    private Float totalLiquido;
    
    
    
    public Float calculaLiquido(lancamentos){
        for (lancamentos l : lancamentos){
        totalLiquido = sum(lancamentos.getLancamento().getValor());
        }
        return totalLiquido;
    }

    public Contracheque() {
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
}

