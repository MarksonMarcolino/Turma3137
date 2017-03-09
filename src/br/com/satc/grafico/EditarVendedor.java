/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.grafico;

import br.com.satc.pessoa.Vendedor;
import br.com.satc.singleton.Singleton;
import javax.swing.JOptionPane;

/**
 *
 * @author Edutec
 */
public class EditarVendedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form EditarVendedor
     */
    public EditarVendedor() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jTFCpf = new javax.swing.JTextField();
        jLCpf = new javax.swing.JLabel();
        jLEspecialidade = new javax.swing.JLabel();
        jTFSalario = new javax.swing.JTextField();
        jLSalario = new javax.swing.JLabel();
        jTFRg = new javax.swing.JTextField();
        jTFCargo = new javax.swing.JTextField();
        jLRG = new javax.swing.JLabel();
        jTFNome = new javax.swing.JTextField();
        jLNome = new javax.swing.JLabel();
        jLTitulo = new javax.swing.JLabel();
        jLSetor = new javax.swing.JLabel();
        jBAlterar = new javax.swing.JButton();
        jTFSetor = new javax.swing.JTextField();
        jBSair = new javax.swing.JButton();
        jLCargo = new javax.swing.JLabel();
        jTFEspecialidade = new javax.swing.JTextField();
        jLCodigo = new javax.swing.JLabel();
        jTFCodigo = new javax.swing.JTextField();
        jBPesquisar = new javax.swing.JButton();
        jLSupervisor = new javax.swing.JLabel();
        jTFSupervisor = new javax.swing.JTextField();

        jTextField2.setText("jTextField2");

        jTFCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFCpfActionPerformed(evt);
            }
        });

        jLCpf.setText("CPF:");

        jLEspecialidade.setText("Especialidade:");

        jLSalario.setText("Salário:");

        jLRG.setText("RG:");

        jLNome.setText("Nome:");

        jLTitulo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLTitulo.setText("Editar de Vendedor");

        jLSetor.setText("Setor:");

        jBAlterar.setText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jBSair.setText("Sair");
        jBSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSairActionPerformed(evt);
            }
        });

        jLCargo.setText("Cargo:");

        jLCodigo.setText("Código:");

        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jLSupervisor.setText("Supervisor:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBAlterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBSair))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLSupervisor)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTFSupervisor, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLCodigo)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTFCodigo))
                                .addComponent(jLTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLNome, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTFNome, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLRG, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLCpf, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLSetor, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLCargo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLSalario, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLEspecialidade, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTFRg, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTFCpf, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTFSetor, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTFCargo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTFSalario, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTFEspecialidade, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGap(46, 46, 46)
                            .addComponent(jBPesquisar))))
                .addGap(0, 28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLTitulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigo)
                    .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLRG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLCpf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLSetor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLCargo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLSalario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLSupervisor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFSupervisor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLEspecialidade)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFEspecialidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAlterar)
                    .addComponent(jBSair))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFCpfActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        String nome, rg, cpf, setor, cargo,supervisor, especialidade;
        int codigo;
        String salario;
        codigo = Integer.parseInt(jTFCodigo.getText());
        nome = jTFNome.getText();
        rg = jTFRg.getText();
        cpf = jTFCpf.getText();
        setor= jTFSetor.getText();
        cargo = jTFCargo.getText();
        supervisor = jTFSupervisor.getText();
        especialidade = jTFEspecialidade.getText();
        try{
            salario = (jTFSalario.getText());
            Singleton.getInstance().vendedores.get(codigo).setNome(nome);
            Singleton.getInstance().vendedores.get(codigo).setCpf(cpf);
            Singleton.getInstance().vendedores.get(codigo).setRg(rg);
            Singleton.getInstance().vendedores.get(codigo).setSetor(setor);
            Singleton.getInstance().vendedores.get(codigo).setCargo(cargo);
            Singleton.getInstance().vendedores.get(codigo).setSalario(Float.parseFloat(salario));
            Singleton.getInstance().vendedores.get(codigo).setSupervisor(supervisor);
            Singleton.getInstance().vendedores.get(codigo).setEspecialidade(especialidade);                     
            JOptionPane.showMessageDialog(this, "Editado com Sucesso!");
            jTFNome.setText("");
            jTFRg.setText("");
            jTFCpf.setText("");
            jTFSetor.setText("");
            jTFCargo.setText("");
            jTFSupervisor.setText("");
            jTFEspecialidade.setText("");
            jTFSalario.setText("");
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(this, "Salário inválido!\n"+nfe);
        } 
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jBSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSairActionPerformed
        dispose();
    }//GEN-LAST:event_jBSairActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
       int var = -1;
        try{
        var = Integer.parseInt(jTFCodigo.getText());
        
        jTFNome.setText(Singleton.getInstance().vendedores.get(var).getNome());
        jTFCpf.setText(Singleton.getInstance().vendedores.get(var).getCpf());
        jTFRg.setText(Singleton.getInstance().vendedores.get(var).getRg());
        jTFSetor.setText(Singleton.getInstance().vendedores.get(var).getSetor());
        jTFCargo.setText(Singleton.getInstance().vendedores.get(var).getCargo());
        jTFSupervisor.setText(Singleton.getInstance().vendedores.get(var).getSupervisor());
        jTFEspecialidade.setText(Singleton.getInstance().vendedores.get(var).getEspecialidade());
        jTFSalario.setText(String.valueOf(Singleton.getInstance().vendedores.get(var).getSalario()));
        }catch(NumberFormatException  nfe){
            JOptionPane.showMessageDialog(this, "Erro ao executar a ação: " + nfe);
        
        }
    }//GEN-LAST:event_jBPesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBSair;
    private javax.swing.JLabel jLCargo;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLCpf;
    private javax.swing.JLabel jLEspecialidade;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLRG;
    private javax.swing.JLabel jLSalario;
    private javax.swing.JLabel jLSetor;
    private javax.swing.JLabel jLSupervisor;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JTextField jTFCargo;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFCpf;
    private javax.swing.JTextField jTFEspecialidade;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFRg;
    private javax.swing.JTextField jTFSalario;
    private javax.swing.JTextField jTFSetor;
    private javax.swing.JTextField jTFSupervisor;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
