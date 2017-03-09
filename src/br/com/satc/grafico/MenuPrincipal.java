/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.satc.grafico;

/**
 *
 * @author Edutec
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
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

        jQuadradoInterno = new javax.swing.JInternalFrame();
        jBarraMenu = new javax.swing.JMenuBar();
        jMCadastro = new javax.swing.JMenu();
        jMICadastroVendedor = new javax.swing.JMenuItem();
        jMConsulta = new javax.swing.JMenu();
        jMIConsultaVendedor = new javax.swing.JMenuItem();
        jMEditar = new javax.swing.JMenu();
        jMIEdicaoVendedor = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jQuadradoInterno.setVisible(true);

        javax.swing.GroupLayout jQuadradoInternoLayout = new javax.swing.GroupLayout(jQuadradoInterno.getContentPane());
        jQuadradoInterno.getContentPane().setLayout(jQuadradoInternoLayout);
        jQuadradoInternoLayout.setHorizontalGroup(
            jQuadradoInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 778, Short.MAX_VALUE)
        );
        jQuadradoInternoLayout.setVerticalGroup(
            jQuadradoInternoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
        );

        jMCadastro.setText("Cadastro");

        jMICadastroVendedor.setText("Vendedor");
        jMICadastroVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMICadastroVendedorActionPerformed(evt);
            }
        });
        jMCadastro.add(jMICadastroVendedor);

        jBarraMenu.add(jMCadastro);

        jMConsulta.setText("Consulta");

        jMIConsultaVendedor.setText("Vendedor");
        jMIConsultaVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIConsultaVendedorActionPerformed(evt);
            }
        });
        jMConsulta.add(jMIConsultaVendedor);

        jBarraMenu.add(jMConsulta);

        jMEditar.setText("Editar");

        jMIEdicaoVendedor.setText("Vendedor");
        jMIEdicaoVendedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIEdicaoVendedorActionPerformed(evt);
            }
        });
        jMEditar.add(jMIEdicaoVendedor);

        jBarraMenu.add(jMEditar);

        setJMenuBar(jBarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jQuadradoInterno)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jQuadradoInterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMICadastroVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMICadastroVendedorActionPerformed
        CadastroVendedor novoCadastro = new CadastroVendedor();
        jQuadradoInterno.add(novoCadastro);
        novoCadastro.setVisible(true);
    }//GEN-LAST:event_jMICadastroVendedorActionPerformed

    private void jMIConsultaVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIConsultaVendedorActionPerformed
        ConsultaVendedor novoConsulta = new ConsultaVendedor();
        jQuadradoInterno.add(novoConsulta);
        novoConsulta.setVisible(true);
    }//GEN-LAST:event_jMIConsultaVendedorActionPerformed

    private void jMIEdicaoVendedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIEdicaoVendedorActionPerformed
        EditarVendedor novaEdicao = new EditarVendedor();
        jQuadradoInterno.add(novaEdicao);
        novaEdicao.setVisible(true);
    }//GEN-LAST:event_jMIEdicaoVendedorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jBarraMenu;
    private javax.swing.JMenu jMCadastro;
    private javax.swing.JMenu jMConsulta;
    private javax.swing.JMenu jMEditar;
    private javax.swing.JMenuItem jMICadastroVendedor;
    private javax.swing.JMenuItem jMIConsultaVendedor;
    private javax.swing.JMenuItem jMIEdicaoVendedor;
    private javax.swing.JInternalFrame jQuadradoInterno;
    // End of variables declaration//GEN-END:variables
}
