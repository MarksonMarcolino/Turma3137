/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.grafico;

import br.com.satc.pessoa.Vendedor;
import br.com.satc.singleton.BancoDeDados;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Usuario
 */
public class VendedorTM extends AbstractTableModel{
    
    private final List<Vendedor> Vendedores;
    public VendedorTM(List<Vendedor> vendedores){
        this.Vendedores = vendedores;
    }
    

    @Override
    public int getRowCount() {
        return Vendedores.size();
    }

    @Override
    public int getColumnCount() {
        return 10;
    }

    @Override
    public Object getValueAt(int i, int i1) {
        Vendedor ven = Vendedores.get(i);
        switch(i1){
            case 0:
                return ven.getNome();
            case 1:
                return ven.getRg();
            case 2:
                return ven.getCpf();
            case 3:
                return ven.getCargo();
            case 4:
                return ven.getSetor();        
            case 5:
                return ven.getEspecialidade();
            case 6:
                return ven.getSalario();
            case 7:
                return ven.getComissao();           
            case 8:
                if (ven.getSupervisor() != null){
                    return ven.getSupervisor().getNome();
                }else{
                    return "Não têm";
                }
            case 9:
                return BancoDeDados.getInstance().Vendedores.indexOf(ven);
        }
            return null;
    }
    
}
