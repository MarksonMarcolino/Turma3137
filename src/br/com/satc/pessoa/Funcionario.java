package br.com.satc.pessoa;

/**
 *
 * @author Soratto
 */
public abstract class Funcionario extends Pessoa implements IFuncionario {
    
    String setor;
    String cargo;
    float salario;
    float comissao;
    float salariofinal;
    Funcionario supervisor;
    
    public Funcionario(String nome, String rg, String cpf, String setor, String cargo, float salario, Funcionario supervisor) {
        super(nome,rg,cpf);
        this.setor = setor;
        this.cargo = cargo;
        this.salario = salario;
        this.salariofinal = salario;
    }

    @Override
    public float calculaComissao(float salario, float porcent) {
        float comissao;
        comissao = salario*(porcent/100);
        setComissao(this.comissao + comissao);
        this.setSalariofinal(this.salariofinal + comissao);
        return comissao;        
    }
    
    @Override
    public void trocaSupervisor(Funcionario supervisor){
        this.supervisor = supervisor;        
    }

    @Override
    public void adicionaBonus(float bonus) {
        setSalariofinal(this.salariofinal + bonus);
    }
    
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }

    public float getSalariofinal() {
        return salariofinal;
    }

    public void setSalariofinal(float salariofinal) {
        this.salariofinal = salariofinal;
    }

    public Funcionario getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Funcionario supervisor) {
        this.supervisor = supervisor;
    }


    
    
}
