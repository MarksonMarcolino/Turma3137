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
public interface IFuncionário {
    public float calcularComissao(float valor, float porcentagem);
    public void adicionarBonus(float bonus);
    public void trocarSupervisor();
}
