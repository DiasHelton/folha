package com.imd.folha.controllers;

import com.imd.folha.model.Lancamento;

public class ContrachequeController {
    
    public void inserirLancamento(String descricao, Float valor){
        
        Lancamento lancamento = new Lancamento(1, descricao, valor);
        lancamento.setDescricao(descricao);
        lancamento.setValor(valor);
        
    }  

    
}
