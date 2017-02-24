package br.com.satc.pessoa;


import br.com.satc.pessoa.Funcionario;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Edutec
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Vendedor supervisor1 = new Vendedor("vendas","supervisor",2950,"Maria","1234567890","0987654321");
     Vendedor supervisor = new Vendedor("vendas","supervisor",3000,"João","1234567890","0987654321");
     Vendedor v1 = new Vendedor("vendas","vendedor",1000,"Zé","1334566467","334735654");
     v1.setSupervisor(supervisor1);
     System.out.println(v1.getSalario()+""+ v1.getSalariofinal());
     System.out.println(v1.calcularcomissao(100, 0.05));
     System.out.println(v1.adicionarbonus(50));
     System.out.println(v1.retornaDados());
     v1.trocarsupervisor(supervisor);
    
    }
    
}
