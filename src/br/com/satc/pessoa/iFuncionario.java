/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.pessoa;


public interface iFuncionario {
    public double calcularcomissao(double valor, double porcentagem);
    public double adicionarbonus(double bonus);
    public void trocarsupervisor(Funcionario supervisor);
}
