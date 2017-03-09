
package br.com.satc.grafico;

import br.com.satc.pessoa.Vendedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class VendedorTableModel extends AbstractTableModel {

   private final List<Vendedor> vendedores;
public VendedorTableModel(List<Vendedor> vendedores){
    this.vendedores = vendedores;
}
    @Override
    public int getRowCount() {
        return vendedores . size();
    }

    @Override
    public int getColumnCount() {
        return 9;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       Vendedor v = vendedores.get(rowIndex);
        switch (columnIndex){
            case 0:
            return v.getNome();
            case 1:
            return v.getCpf();
            case 2:
            return v.getRg();
            case 3:
            return v.getSalario();
             case 4:
            return v.getSetor();
            case 5:
            return v.getCargo();
            case 6:
            return v.getEspecialidade();
            case 7:
            return v.getBonus();
            case 8: 
                return v.getSalario()+v.getBonus();
        }
return null;
    }
    @Override
    public String getColumnName(int column) {
        switch (column){
            case 0:
                return "Nome";
            case 1:
                return "Cpf";
            case 2:
                return "Rg";
            case 3:
                return "Salario";
             case 4:
                return "Setor";
            case 5:
                return "Cargo";
            case 6:
                return "Especialidade";
                case 7:
                return"bonus";
              
            case 8:
                return"Salario Final";
          
        }
        return "";
    }
    
}
