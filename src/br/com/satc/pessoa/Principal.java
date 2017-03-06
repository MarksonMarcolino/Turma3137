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
        // TODO code application logic here
        Vendedor  v1 = new Vendedor("Consultor","Corporativo", "Profissional", 3000, "Nicolas", "1243141241", "2143141312");
        v1.AdicionarBonus(20f);
        v1.CalcularComissao(3000, 5);
        v1.TrocarSupervisor(v1);
        
        System.out.println(v1.retornaDados());
        
    }
    
}
