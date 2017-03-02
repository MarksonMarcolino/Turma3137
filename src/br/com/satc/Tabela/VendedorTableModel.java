package br.com.satc.Tabela;

import br.com.satc.pessoa.Vendedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class VendedorTableModel extends AbstractTableModel{
    
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
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
 Vendedor c = vendedores.get(rowIndex);
        switch (columnIndex){
            case 0:
            return c.getNome();
            case 1:
            return c.getCpf();
            case 2:
            return c.getRg();
            case 3:
            return c.getSalario();
            case 4:
            return c.getSetor();
            case 5:
            return c.getCargo();
            case 6:
            return c.getEspecialidade();
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
        }
        return "";
    }
}
