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
public class Funcionario extends Pessoa implements iFuncionario{
    private String setor, cargo;
    private double salario, comissao, salariofinal; 
    private Funcionario supervisor;
    

    public Funcionario(String setor, String cargo, double salario, String nome, String rg, String cpf, String logradouro, Float renda) {
        super(nome, rg, cpf, logradouro, renda);
        this.setor = setor;
        this.cargo = cargo;
        this.salario = salario;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getSalariofinal() {
        return salariofinal;
    }

    public void setSalariofinal(double salariofinal) {
        this.salariofinal = salariofinal;
    }

    public Funcionario getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Funcionario supervisor) {
        this.supervisor = supervisor;
    }
    
    

    @Override
    public String retornaDados() {
        return "Cpf: "+this.getCpf()+" Nome: "+this.getNome()+" RG: "+this.getRg()+"Logradouro: "+this.getLogradouro()+"Renda: "+this.getRenda()+"Setor: "+this.getSetor()+"Cargo: "+this.getCargo();
    }

    @Override   
    public void AlteraNome(String nome) {
        this.setNome(nome);
    }

    @Override
    public double calcularcomissao(double valor, double porcentagem) {
       double comissao = valor*0.05;
       salariofinal+=salario+comissao;
       return salariofinal;
    }

    @Override
    public double adicionarbonus(double bonus) {
        salariofinal= salariofinal+bonus;
        return salariofinal;
    }

    @Override
    public void trocarsupervisor(Funcionario supervisor) {
        this.setSupervisor(supervisor);
    }

}
