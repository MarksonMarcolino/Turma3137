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
public abstract class Funcionário extends Pessoa implements iFuncionário{
    
    String setor, cargo;
    float salario, comissao, salariofinal;
    Funcionário supervisor;

    public Funcionário getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Funcionário supervisor) {
        this.supervisor = supervisor;
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

    public float getSalariofinal() {
        return salariofinal;
    }

    public void setSalariofinal(float salariofinal) {
        this.salariofinal = salariofinal;
    }
    
    public Funcionário(String nome, String rg, String cpf, String setor, String cargo, Funcionário supervisor, Float salario, Float comissao, Float salariofinal) {
        super(nome, rg, cpf);
        this.setSetor(setor);
        this.setCargo(cargo);
        this.setSupervisor(supervisor);
        this.setSalario(salario);
        this.setComissao(comissao);
        this.salariofinal=salario+this.comissao;
        }
    
    
    public float CalcularComissao(float valor, float porcentagem){
        float comisao;
        comisao = salario*(porcentagem/100);
        setComissao(this.comissao+comisao);
        this.setSalariofinal(this.salariofinal+comisao);
        return comisao;
        }
    
    public void AdicionarBonus(float bonus){
        this.setSalariofinal(this.salariofinal+bonus);
    }
    
    public void TrocarSupervisor(Funcionário supervisor){
        this.setSupervisor(supervisor);
    }
    
}
