package br.com.satc.pessoa;

/**
 *
 * @author Soratto
 */
public class Vendedor extends Funcionario {
    String especialidade;

    public Vendedor(String nome, String rg, String cpf, String setor, String cargo, float salario, String especialidade) {
        super(nome, rg, cpf, setor, cargo, salario);
        this.especialidade = especialidade;
        this.comissao = 0;
        this.supervisor = null;
    }

    @Override
    public String retornaDados() {
        String dados = "Nome: "+this.getNome()
                +"\nRG: "+this.getRg()
                +"\nCPF: "+this.getCpf()
                +"\nSetor: "+this.getSetor()
                +"\nCargo: "+this.getCargo()
                +"\nSalário: "+this.getSalario()
                +"\nSalário Final: "+this.getSalariofinal()
                +"\nSupervisor: "+this.getEspecialidade();
        return dados;
    }

    @Override
    public void AlteraNome(String nome) {
        this.setNome(nome);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    
    
}
