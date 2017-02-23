/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.pessoa;

/**
 *
 * @author Markson
 */
public class Cliente extends Pessoa {
        String logradouro;
        Double renda;

    public Cliente(String nome, String rg, String cpf,String logradouro, Double renda) {
        super(nome, rg, cpf);
        this.logradouro = logradouro;
        this.renda = renda;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }

    @Override
    public String retornaDados() {
        throw new UnsupportedOperationException("Nome:"+this.getNome()+" Rg:"+this.getRg()+" CPF:"+this.getCpf()+" Logradouro:"+this.getLogradouro()+" Renda:"+this.getRenda());
    }

    @Override
    public void AlteraNome(String nome) {
       this.setNome(nome);
    }
        
    
        
        
        
}