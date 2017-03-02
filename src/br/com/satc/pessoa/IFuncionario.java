package br.com.satc.pessoa;

/**
 *
 * @author Soratto
 */
public interface IFuncionario {
    
    public float calculaComissao(float valor, float porcent);
    public void adicionaBonus(float bonus);
    public void trocaSupervisor(Funcionario supervisor);
    
}
