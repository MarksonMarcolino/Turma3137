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
        this.especialidade = especialidade;
        this.comissao = 0;
        this.supervisor = null;
    }

    @Override
    public String retornaDados() {
            String dados = "Nome: "+this.getNome()
                +"\nRG: "+this.getRg()
                 +"\nCPF: "+this.getCpf()
                  +"\nSetor: "+this.getSetor()
                   +"\nCargo: "+this.getCargo()
                    +"\nSalário: "+this.getSalario()
                     +"\nSalário Final: "+this.getSalariofinal()
                      +"\nSupervisor: "+this.getEspecialidade();
        return dados;
    }

    @Override
    public void AlteraNome(String nome) {
        this.setNome(nome); 
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
