
package br.com.satc.singleton;

import br.com.satc.pessoa.Vendedor;
import java.util.ArrayList;
import java.util.List;


public class Classe_Singleton {
    
    public List<Vendedor>vendedores = new ArrayList();
    
    public List<Vendedor> pesquisaNome(String especialidade, List<Vendedor> vendedores){
        List<Vendedor>vendedoresp = new ArrayList();
            for (Vendedor vendedor : vendedores){
                if(vendedor.getEspecialidade().toUpperCase().contains(especialidade.toUpperCase())){
                    vendedoresp.add(vendedor);
            }
        
        }
        return vendedoresp;
    
    }
    
    public List<Vendedor> pesquisaCodigo(int codigo, List<Vendedor> vendedores){
        List<Vendedor>pesquisaCodigo = new ArrayList();
        pesquisaCodigo.add(vendedores.get(codigo));
        return pesquisaCodigo;
    }
    
    
    private Classe_Singleton() {
    }
    
    public static Classe_Singleton getInstance() {
        return Classe_SingletonHolder.INSTANCE;
    }
    
    private static class Classe_SingletonHolder {

        private static final Classe_Singleton INSTANCE = new Classe_Singleton();
    }
    
    
}
