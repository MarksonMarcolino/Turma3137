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
public class Executavel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        
        Vendedor p1 = new Vendedor("Felipe","125125","125215","Compras","Estagiário",1780);
        
        p1.setComissao(p1.getComissao() + p1.calcularComissao(500, 10));
        
        p1.adicionarBonus(501);
        
        p1.setSalarioFinal(p1.getSalario()+p1.getComissao());
        
        p1.trocarSupervisor(p1);
        
        System.out.println(p1.retornaDados());
        
        
        
        
        
        
        
    }
    
}
