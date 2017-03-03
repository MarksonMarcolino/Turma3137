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

    public Cliente(String nome, String rg, String cpf) {
        super(nome, rg, cpf);
    }

    @Override
    public String retornaDados() {
        String ata;
        ata = "Nome : "+this.getNome()+"\nCPF : "+this.getCpf()+"\nRG : "+this.getRg();
        return ata;
    }

    @Override
    public void AlteraNome(String novoNome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
