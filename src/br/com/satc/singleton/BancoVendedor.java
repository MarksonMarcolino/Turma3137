/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.singleton;

import br.com.satc.pessoa.Vendedor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Edutec
 */
public class BancoVendedor {
    
    public List<Vendedor> vendedores = new ArrayList();
    
    public List<Vendedor> pesquisaNome(String nome, List<Vendedor> vendedores) {
        List<Vendedor> NomeVendedor = new ArrayList();
        for (Vendedor vendedor : vendedores) {
            if (vendedor.getNome().toUpperCase().contains(nome.toUpperCase())) {
                NomeVendedor.add(vendedor);
            }

        }
        return NomeVendedor;
    }
    
    public List<Vendedor> pesquisaCodigo(int codigo, List<Vendedor> clientes) {
        List<Vendedor> pesquisaCodigo = new ArrayList();
        pesquisaCodigo.add(clientes.get(codigo));
        return pesquisaCodigo;
    }
    
    private BancoVendedor() {
    }
    
    public static BancoVendedor getInstance() {
        return BancoVendedorHolder.INSTANCE;
    }
    
    private static class BancoVendedorHolder {

        private static final BancoVendedor INSTANCE = new BancoVendedor();
    }
}
