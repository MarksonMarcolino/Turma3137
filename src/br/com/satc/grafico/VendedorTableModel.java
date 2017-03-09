/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.grafico;

import br.com.satc.pessoa.Vendedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Edutec
 */
public class VendedorTableModel extends AbstractTableModel{
    
    private final List<Vendedor> vendedores;
    public VendedorTableModel(List<Vendedor> vendedores){
    this.vendedores = vendedores;
    }

    @Override
    public int getRowCount() {
        return vendedores.size();
    }

    @Override
    public int getColumnCount() {
        return 10 ;
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
                return v.getSetor();
            case 4:
                return v.getCargo();
            case 5:
                return v.getSalario();
            case 6:
                return "";
            case 7:
                return v.getEspecialidade();
            case 8:
                return v.getSalariofinal();
            case 9:
                return v.getComissao();
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
                return "Setor";
            case 4:
                return "Cargo";
            case 5:
                return "Salário";
            case 6:
                return "Supervisor";
            case 7:
                return "Especialidade";
            case 8:
                return "Salário Final";
            case 9:
                return "Comissão";
        }
        return "";
    }
    
}
