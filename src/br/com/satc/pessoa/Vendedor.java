package br.com.satc.pessoa;

public class Vendedor extends Funcionário {
    
    public String Especialidade;

    public Vendedor(String nome, String rg, String cpf, String setor, String cargo, float salario, String especialidade) {
        super(nome, rg, cpf, setor, cargo, salario);
        this.setEspecialidade(especialidade);
    }
    
    @Override
    public String retornaDados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void AlteraNome(String nome) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public float Calcularcomissao() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Adicionarbonus() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Trocarsupervisor() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getEspecialidade() {
        return Especialidade;
    }

    public void setEspecialidade(String Especialidade) {
        this.Especialidade = Especialidade;
    }

  
    
}
