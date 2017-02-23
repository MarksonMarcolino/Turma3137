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
    double renda;

    public Cliente(String nome, String rg, String cpf, String logradouro, double renda) {
        super(nome, rg, cpf);
        this.setLogradouro(logradouro);
        this.setRenda(renda);
        
    }

    @Override
    public String retornaDados() {
        String dados = "Nome: "+this.getNome()
                +"RG: "+this.getRg()
                +"CPF:"+this.getCpf()
                +"Logradouro: "+this.getLogradouro()
                +"Renda: "+this.getRenda();
        return dados;
        
    }

    @Override
    public void AlteraNome(String nome) {
        this.setNome(nome);
        
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
    
}
