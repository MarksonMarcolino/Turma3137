package br.com.satc.pessoa;

public abstract class Funcionário extends Pessoa implements IFuncionário{
    String setor;
    String cargo;
    float salario;
    float comissao;
    float salariofinal;
    String Supervisor;
    
    public Funcionário(String nome, String rg, String cpf,String setor,String cargo,float salario) {
        super(nome, rg, cpf);
        this.setSetor(setor);
        this.setCargo(cargo);
        this.setSalario(salario);
        this.salariofinal= salario;
    }
    public float Calcularcomissao(float valor,float porcentagem){
        float comissao;
        comissao= salario*(porcentagem/100);
        setComissao(this.comissao+comissao);
        this.setSalariofinal(this.salariofinal+comissao);
        return comissao;
    }
    public void Adicionarbonus(float bonus){
        this.setSalariofinal(this.salariofinal+bonus);    
    }
    public void Trocarsupervisor(String superv){
        this.setSupervisor(superv);   
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

    public String getSupervisor() {
        return Supervisor;
    }

    public void setSupervisor(String Supervisor) {
        this.Supervisor = Supervisor;
    }
    
    
}