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
public class BancoDeDados {
    
    public List<Vendedor> Vendedores = new ArrayList();
    
    public List<Vendedor> PesquisarID(int ID){
        List<Vendedor> PesquisarCodigo = new ArrayList();
        PesquisarCodigo.add(Vendedores.get(ID));
        return PesquisarCodigo;
    }
    
    public List<Vendedor> pesquisaNome(String nome, List<Vendedor> clientes){
        List<Vendedor> Nomevendedor = new ArrayList();
        for(Vendedor vendedor: Vendedores){
            if(vendedor.getNome().toLowerCase().contains(nome.toLowerCase())){
                Nomevendedor.add(vendedor);
            }
        }
        return Nomevendedor;
    }       
    
    private BancoDeDados() {
    }
    
    public static BancoDeDados getInstance() {
        return BancoDeDadosHolder.INSTANCE;
    }
    
    private static class BancoDeDadosHolder {

        private static final BancoDeDados INSTANCE = new BancoDeDados();
    }
}
