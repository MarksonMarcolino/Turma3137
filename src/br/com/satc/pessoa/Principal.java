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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vendedor sup1 = new Vendedor ("Vendas","Supervisor",4500,"José","4312567854365","987654321897654","Rua seila bixo",5000f);
        Vendedor sup2 = new Vendedor ("Vendas","Supervisor",4000,"Josénilda","4312567854365","987654321897654","Rua seila bixo",3000f);
        Vendedor ven1 = new Vendedor ("Vendas","Vendedorzim",2500,"Josénildo","9876367854365","456754345897654","Rua tonem ai bixo",3000f);
        ven1.setSupervisor(sup1);
        ven1.calcularcomissao(300, 0.05);
        ven1.adicionarbonus(200);
        ven1.trocarsupervisor(sup2);
        
    }
    
}
