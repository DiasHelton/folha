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
    private String cpf;
    
    public Contratado(Integer id, String matricula, String cpf, String nome, String telefone, String email, Endereco endereco) {
        this.id = id;
        this.matricula = matricula;
        this.cpf = cpf;
        super.setNome(nome);
        super.setTelefone(telefone);
        super.setEmail(email);
        super.setEndereco(endereco);
        
    }
    public String getMatricula() {
        return matricula;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
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
