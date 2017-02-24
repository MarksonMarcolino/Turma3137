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
public abstract class Funcionario extends Pessoa implements IFuncionario {
    private String setor,cargo;
    private double salario,comissao,salariofinal;
    private Funcionario Supervisor;

    public Funcionario(String setor, String cargo, double salario, String nome, String rg, String cpf) {
        super(nome, rg, cpf);
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
        return Supervisor;
    }

    public void setSupervisor(Funcionario Supervisor) {
        this.Supervisor = Supervisor;
    }
  @Override
 public double calcularcomissao(double valor,double porcentagem){
     this.comissao =valor*porcentagem;
     salariofinal+=salario + comissao;
     return salariofinal;
 }   

 @Override
 public double adicionarbonus(double bonus){
     salariofinal+=bonus;
     return salariofinal;
 } 
    @Override
    public void trocarsupervisor(Funcionario supervisor){
       this.setSupervisor(supervisor);
    }
     @Override
    public String retornaDados() {
        return this.getNome() + this.getCpf()+this.getRg() + this.getComissao()+this.getCargo()+ this.getSalario()+this.getSalariofinal()+this.getSupervisor();
    }

    @Override
    public void AlteraNome(String novoNome) {
       this.setNome(novoNome);
    }
}
