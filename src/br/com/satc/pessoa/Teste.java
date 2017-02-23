package br.com.satc.pessoa;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Edutec
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Oi","Oi","Oi","Oi",25f);
        
        
        c1.AlteraNome("binomassa");
        System.out.println(c1.retornaDados());
        System.out.println("oi");
    }
    
}
