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
public class Vendedor extends Funcionario {
    String especialidade;

    public Vendedor(String nome, String rg, String cpf, String setor, String cargo, float salario, String especialidade) {
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
                        +"\nSalário Final: "+this.getSalariof()
                        +"\nSupervisor: "+this.getEspecialidade();
        return dados;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public float getSalariof() {
        return salariof;
    }

    public void setSalariof(float salariof) {
        this.salariof = salariof;
    }

    public Funcionario getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Funcionario supervisor) {
        this.supervisor = supervisor;
    }

    @Override
    public void adicionarbonus(float bonus) {
        this.setSalariof(this.getSalariof()+bonus);
    }

    @Override
    public void trocarsupervisor(Funcionario supervisor) {
        this.setSupervisor(supervisor);
    }

    @Override
    public void AlteraNome(String nome) {
        this.setNome(nome);
    }
    
}
