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
public abstract class Funcionario extends Pessoa implements IFuncionario{
    String setor,cargo;
    float salario,comissao,salariof;
    Funcionario supervisor;

    public Funcionario(String nome, String rg, String cpf, String setor, String cargo, float salario) {
        super(nome,rg,cpf);
        this.setor = setor;
        this.cargo = cargo;
        this.salario = salario;
        this.salariof = salario;
    }
    
    @Override
    public float calcularcomissao(float val,float porcentagem){
        float comissao;
        comissao = (salario*porcentagem)/100;
        return comissao;
    }
    
    public void adicionarBonus(float Bonus){
        this.setSalariof(this.getSalariof()+Bonus);
    }
    
    public void trocarSupervisor(Funcionario supervisor){
        this.setSupervisor(supervisor);
    }

    public Funcionario getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Funcionario supervisor) {
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

    public float getSalariof() {
        return salariof;
    }

    public void setSalariof(float salariof) {
        this.salariof = salariof;
    }
    
}
