
package br.com.satc.pessoa;


public class Cliente extends Pessoa {
    private String logradouro;
    private Double renda;
    
    public Cliente(String nome, String rg, String cpf) {
        super(nome, rg, cpf);
        this.setRenda(renda);
        this.setLogradouro(logradouro);
            
    }
    
    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Double getRenda() {
        return renda;
    }

    public void setRenda(Double renda) {
        this.renda = renda;
    }


    @Override
    public String retornaDados() {
        
     String dados = "Nome: " + this.getNome()
       +"\nRG " + this.getRg() 
       +"\nCPF " + this.getCpf()
       +"\nRenda " + this.getRenda()
       +"\nLogradouro " + this.getLogradouro();
     
     return dados;
    }

    @Override
    public void AlteraNome(String novoNome) {
        this.setNome(novoNome);
    }
    
    private String logradouro;
    private float renda;

    public Cliente(String nome, String rg, String cpf, String logradouro, float renda) {
        super(nome, rg, cpf);
        this.setLogradouro(logradouro);
        this.setRenda(renda);
    }


    @Override
    public String retornaDados() {
        String dados = "Nome: "+this.getNome()
                +"\nRG: "+this.getRg()
                +"\nCPF: "+this.getCpf()
                +"\nLogradouro"+this.getLogradouro()
                +"\nRenda: "+this.getRenda();
        return dados;
    }

    @Override
    public void AlteraNome(String nome) {
        this.setNome(nome);
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public float getRenda() {
        return renda;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }
    
    
}
