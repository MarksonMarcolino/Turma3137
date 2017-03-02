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
public class Vendedor extends Funcionário{
    
    String especialidade;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    public Vendedor(String nome, String rg, String cpf, String setor, String cargo, float salario, float comissao, float salariofinal, Funcionário supervisor, String especialidade) {
        super(nome, rg, cpf, setor, cargo, salario, comissao, salariofinal, supervisor);
        this.especialidade = especialidade;
    }

    @Override
    public String retornaDados() {
        String dados = "Nome: "+this.getNome()+
                     "\nRG: "+this.getRg()+
                     "\nCPF: "+this.getCpf()+
                     "\nSetor: "+this.getSetor()+
                     "\nCargo: "+this.getCargo()+
                     "\nSalario: "+this.getSalario()+
                     "\nComissão: "+this.getComissao()+
                     "\nSalário final: "+this.getSalariofinal()+
                     "\nSupervisor: "+this.getSupervisor()+
                     "\nEspecialidade: "+this.getEspecialidade();
        
        return dados;
    }

    @Override
    public void AlteraNome(String novoNome) {
        this.setNome(novoNome);
    }

    @Override
    public void adicionarBonus(float bonus) {
        this.setSalariofinal(this.getSalariofinal()+bonus);
    }

    @Override
    public void trocarSupervisor() {
        this.setSupervisor(supervisor);
    }
    
}
