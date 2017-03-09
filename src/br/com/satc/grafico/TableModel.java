/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.grafico;

import br.com.satc.pessoa.Vendedor;
import br.com.satc.singleton.VendedorSingleton;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author i5
 */
public class TableModel extends AbstractTableModel{
    private final List<Vendedor> vendedores;
    public TableModel(List<Vendedor> vendedores){
        this.vendedores = vendedores;
    }
    
    @Override
    public int getRowCount() {
        return vendedores.size();
    }

    @Override
    public int getColumnCount() {
        return 11;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Vendedor v = vendedores.get(rowIndex);
        switch(columnIndex){
            case 0:
                return v.getNome();
            case 1:
                return v.getRg();
            case 2:
                return v.getCpf();
            case 3:
                return v.getCargo();
            case 4:
                return v.getSetor();        
            case 5:
                return v.getEspecialidade();
            case 6:
                return v.getSalario();
            case 7:
                return v.getComissao();
            case 8:
                return v.getSalariof();
            case 9:
                if (v.getSupervisor() != null){
                    return v.getSupervisor().getNome();
                }else{
                    return "Não possui";
                }
            case 10:
                return VendedorSingleton.getInstance().vendedores.indexOf(v);
        }
            return null;
    }
    @Override
    public String getColumnName(int column){
    switch(column){
        case 0:
            return "Nome";
        case 1:
            return "RG";
        case 2:
            return "CPF";
        case 3:
            return "Cargo";
        case 4:
            return "Setor";        
        case 5:
            return "Especialidade";
        case 6:
            return "Salário";
        case 7:
            return "Comissão";
        case 8:
            return "Salário Final";
        case 9:
            return "Supervisor";
        case 10:
            return "ID";
    }
    return "";
}
}
