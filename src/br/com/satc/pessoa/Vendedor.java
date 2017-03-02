/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.pessoa;

/**
 *
 * @author Edutec
 */
public class Vendedor extends Funcionário {
    
    String especialidade;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Vendedor(String nome, String rg, String cpf, String setor, String cargo,String especialidade, Float salario) {
        super(nome, rg, cpf, setor, cargo, salario);
        this.setEspecialidade(especialidade);
    }

    @Override
    public String retornaDados() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void AlteraNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public float CalcularComissao() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void AdicionarBonus() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void TrocarSupervisor() {
        throw new UnsupportedOperationException("Not supported yet."); 
    
    }
}
