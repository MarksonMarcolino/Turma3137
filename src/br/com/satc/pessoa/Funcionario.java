
package br.com.satc.pessoa;


public abstract class Funcionario {
    private String cargo, supervisor, setor;
    private float salario, salariof;
    
    Funcionario(String cargo, String supervisor, String setor, float salario, float salariof){
        this.setCargo(cargo);
        this.setSalario(salario);
        this.setSalariof(salariof);
        this.setSetor(setor);
        this.setSupervisor(supervisor);
    }
    
    public float CalcularComissao(float valor, float porcentagem){
        float comissao;
        comissao = (salario*porcentagem)/100;
      
        
        return comissao;
    }
    
    public void AdicionarBonus(float bonus){
        this.setSalariof(this.salariof + bonus);
        
    }
    
    public void Supervisor(Funcionario superv){
        this.setSupervisor(supervisor);
        
        
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getSalariof() {
        return salariof;
    }

    public void setSalariof(float salariof) {
        this.salariof = salariof;
    }
   
}
