/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.grafico;

import br.com.satc.pessoa.Vendedor;
import br.com.satc.singleton.BancoVendedor;

/**
 *
 * @author Edutec
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vendedor v = new Vendedor("nomea", "rg", "cpf", "setor", "cargo", 0, "especialidade");
         BancoVendedor.getInstance().vendedores.add(v);
         System.out.println(BancoVendedor.getInstance().vendedores.get(0).getNome());
    }
    
}
