
package br.com.satc.grafico;

import br.com.satc.pessoa.Vendedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Edutec
 */
public class VendedorTableModel extends AbstractTableModel {
    
    private final List<Vendedor> vendedores;
        
    public VendedorTableModel(List<Vendedor>vendedores){
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
        switch(columnIndex){
            case 0:
                return v.getNome();
            case 1:
                return v.getCpf();
            case 2:
                return v.getRg();
            case 3:
                return v.getCargo();
            case 4:
                return v.getSupervisor();
            case 5:
                return v.getSetor();
            case 6:
                return v.getSalario();
            case 7:
                return v.getEspecialidade();
            case 8:
                return v.getSalariof();
            case 9:
                return v.getComissao();    
        }
        return null;
    }
    
    @Override
    public String getColumnName(int column){
        switch (column){
            case 0:
                return "Nome";
            case 1:
                return "Cpf";
            case 2:
                return "Rg";
            case 3:
                return "Cargo";
            case 4:
                return "Supevisor";
            case 5:
                return "Setor";
            case 6:
                return "Salário";
            case 7:
                return "Especialidade";
            case 8:
                return "Salariof";
            case 9:
                return "Comissão";
        }
        return"";
    }
    
    }
    

