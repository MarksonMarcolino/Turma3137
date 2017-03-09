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
double bonus;

    public Vendedor(String especialidade, String setor, String cargo, double salario, String nome, String rg, String cpf) {
        super(setor, cargo, salario, nome, rg, cpf);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }


  

    
   
    
}
