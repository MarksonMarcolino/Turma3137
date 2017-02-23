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
    
    Funcionario supervisor;
    float salarioFinal, comissao;

    public float getSalarioFinal() {
        return salarioFinal;
    }

    public void setSalarioFinal(float salarioFinal) {
        this.salarioFinal = salarioFinal;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
    
    

    public Funcionario getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Funcionario supervisor) {
        this.supervisor = supervisor;
    }
    
    

    public Vendedor(String nome, String rg, String cpf, String setor, String cargo, float Salario) {
        super(nome, rg, cpf, setor, cargo, Salario);
    }

    @Override
    public String retornaDados() {
                String ata;
        ata = "Nome : "+this.getNome()+"\nCPF : "+this.getCpf()+"\nRG : "+this.getRg()+"\nSetor : "+this.getSetor()+"\nCargo : "+this.getCargo()+"\nSalário : "+this.getSalario()+"\nComissão : "+this.getComissao()+"\nSalário final :"+this.getSalarioFinal();
        return ata;
    }

    @Override
    public void AlteraNome(String novoNome) {
    this.setNome(novoNome);
    }

    @Override
    public float calcularComissao(float valor, float porcentagem) {
    float calculo;
    calculo = valor*porcentagem;
    return calculo;
    }

    @Override
    public void adicionarBonus(float bonus) {
        this.setSalarioFinal(this.getSalarioFinal()+bonus);       
    }
    
}
