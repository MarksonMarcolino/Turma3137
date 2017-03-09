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
public class VendedorSingleton {
    public List<Vendedor> vendedores = new ArrayList();
    
    public List<Vendedor> pesquisaNome(String nome, List<Vendedor> clientes){
        List<Vendedor> VendedorNome = new ArrayList();
        for(Vendedor vendedor : vendedores){
        if(vendedor.getNome().toLowerCase().contains(nome.toLowerCase())){
        VendedorNome.add(vendedor);
                    
        }
    }
        return VendedorNome;
    }
    public List<Vendedor> pesquisaID(int ID){
        List<Vendedor> pesquisaCodigo = new ArrayList();
        pesquisaCodigo.add(vendedores.get(ID));
        return pesquisaCodigo;
    }
    
    private VendedorSingleton() {
    }
    
    public static VendedorSingleton getInstance() {
        return VendedorSingletonHolder.INSTANCE;
    }
    
    private static class VendedorSingletonHolder {
            private static final VendedorSingleton INSTANCE = new VendedorSingleton();
            
            
    }
}
