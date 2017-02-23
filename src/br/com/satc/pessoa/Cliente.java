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
    double renda;
    String logradouro;

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Cliente(String nome, String rg, String cpf) {
        super(nome, rg, cpf);
        this.setRenda(renda);
        this.setLogradouro(logradouro);
        }

    @Override
    public String retornaDados() {
        String dados = "Nome: "+this.getNome()
               +"\nRG: "+this.getRg()
                +"\nCPF: "+this.getCpf()
                 +"\nLogradouro: "+this.getLogradouro()
                  +"\nRenda: "+this.getRenda();
        return dados;
    }

    @Override
    public void AlteraNome(String Nome) {
        this.setNome(Nome);
    }
    
}
