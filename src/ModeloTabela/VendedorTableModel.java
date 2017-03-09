
package ModeloTabela;

import br.com.satc.pessoa.Vendedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;


public class VendedorTableModel extends AbstractTableModel{
    
    private final List<Vendedor> vendedores;
    
    public VendedorTableModel(List<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }
    @Override
    public int getRowCount() {
        return vendedores.size();
    }

    @Override
    public int getColumnCount() {
        return 10;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Vendedor v = vendedores.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return v.getNome();
            case 1:
                return v.getCargo();
            case 2:
                return v.getSetor();
            case 3:
                return v.getRg();
            case 4:
                return v.getCpf();
            case 6:
                return v.getComissao();
            case 7:
                return v.getSalario();
            case 8:
                return v.getEspecialidade();
            case 9:
                return v.getSupervisor();
        }
        return null;
    }
    
}
