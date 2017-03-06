/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TableModel;

import br.com.satc.pessoa.Vendedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Nicolas Zim
 */
public class TableModel extends AbstractTableModel {
    
    private final List<Vendedor> Vendedores;
         public TableModel(List<Vendedor> vendedores){
            this.Vendedores = vendedores;
        }


    
    @Override
    public int getRowCount() {
        return Vendedores.size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
                Vendedor v = Vendedores.get(rowIndex);
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
                        return v.getSalario()+v.getComissao();
                }return null;
    }
        @Override
    public String getColumnName (int column){
        switch (column){
            case 0:
                return "Nome";
            case 1:
                return "Rg";
            case 2:
                return "Cpf";
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
        }
        return null;
    }
   
    
}
