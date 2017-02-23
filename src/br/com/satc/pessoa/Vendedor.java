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
public class Vendedor extends Funcionario{

    public Vendedor(String setor, String cargo, float salario, float salariofinal, String nome, String rg, String cpf) {
        super(setor, cargo, salario, salariofinal, nome, rg, cpf);
    }

    @Override
    public String retornaDados() {
        throw new UnsupportedOperationException("Nome:"+this.getNome()+"\nRG:"+this.getRg()+"\nCPF:"+this.getCpf()+"\nSalario:"+this.getSalario()+"\nSetor:"+this.getSetor()+"\nCargo:"+this.getCargo()+"\nSalario Final:"+this.getSalariofinal()+"\nComissao:"+this.getComissao()+"\nSupervisor:"+this.getSupervisor().getNome());
    }

    @Override
    public void AlteraNome(String Nome) {
        this.setNome(nome);
    }

    @Override
    public float CalcularComissao(float val,float porcentagem) {
        float ComiVend;
        ComiVend = val*(porcentagem/100);
        this.setComissao(ComiVend);
        return ComiVend;
    }

    @Override
    public void AdicionarBonus(float valor) {
        this.setSalariofinal(this.getSalariofinal()+valor);
        
    }

    @Override
    public void TrocarSupervisor(Funcionario Supervisor) {
        this.setSupervisor(Supervisor);
    }

  
    
}


