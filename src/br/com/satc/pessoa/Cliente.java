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

    public Cliente(String logradouro, double renda, String nome, String rg, String cpf) {
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

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
    

    @Override
    public String retornaDados() {
        return this.getNome() + this.getCpf()+this.getLogradouro()+this.getRg()+ this.getRenda();
    }

    @Override
    public void AlteraNome(String novoNome) {
       this.setNome(novoNome);
    }
    
    private String logradouro;
    private float renda;

    public Cliente(String nome, String rg, String cpf, String logradouro, float renda) {
        super(nome, rg, cpf);
        this.setLogradouro(logradouro);
        this.setRenda(renda);
    }


    @Override
    public String retornaDados() {
        String dados = "Nome: "+this.getNome()
                +"\nRG: "+this.getRg()
                +"\nCPF: "+this.getCpf()
                +"\nLogradouro"+this.getLogradouro()
                +"\nRenda: "+this.getRenda();
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

    public float getRenda() {
        return renda;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }
    
    
}
