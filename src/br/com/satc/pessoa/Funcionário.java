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
public abstract class Funcionário extends Pessoa implements IFuncionário{
    private String setor,cargo;
    private float salario, comissao, salariofinal;
    Funcionário supervisor;

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

    public float getSalariofinal() {
        return salariofinal;
    }

    public void setSalariofinal(float salariofinal) {
        this.salariofinal = salariofinal;
    }

    public Funcionário getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Funcionário supervisor) {
        this.supervisor = supervisor;
    }
    
    public Funcionário(String nome, String rg, String cpf, String setor, String cargo, float salario, float comissao, float salariofinal, Funcionário supervisor) {
        super(nome, rg, cpf);
        this.setor = setor;
        this.cargo = cargo;
        this.salario = salario;
        this.comissao = comissao;
        this.salariofinal = salariofinal;
        this.supervisor = supervisor;
    }
    public float calcularComissao(float valor, float porcentagem){
        float comissao;
        comissao = (salario/100)*porcentagem;
        return comissao;
    }
    
    public void AdicionarBonus(float Bonus){
        this.setSalariofinal(this.getSalariofinal()+Bonus);
    }
    
    public void trocarSupervisor(Funcionário supervisor){
        this.setSupervisor(supervisor);
    }
}
