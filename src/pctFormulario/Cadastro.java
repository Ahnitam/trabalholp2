/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pctFormulario;

import javax.swing.JOptionPane;
import pctControle.Usuario;
import pctDAO.UsuarioDAO;

/**
 *
 * @author Luis Henrique
 */
public class Cadastro extends javax.swing.JFrame {

    /**
     * Creates new form Cadastro
     */
    public Cadastro() {
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

        txtUserReg = new javax.swing.JTextField();
        PassRegLabel = new javax.swing.JLabel();
        btnRegReg = new javax.swing.JButton();
        UserRegLabel = new javax.swing.JLabel();
        emailRegLabel = new javax.swing.JLabel();
        txtEmailReg = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        PassRegLabel1 = new javax.swing.JLabel();
        txtRegPass = new javax.swing.JPasswordField();
        txtRegPassConfirm = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastrar");
        setLocation(new java.awt.Point(0, 0));

        txtUserReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserRegActionPerformed(evt);
            }
        });

        PassRegLabel.setText("Senha:");

        btnRegReg.setText("Cadastrar");
        btnRegReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegRegActionPerformed(evt);
            }
        });

        UserRegLabel.setText("Usuário:");

        emailRegLabel.setText("Email:");

        txtEmailReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailRegActionPerformed(evt);
            }
        });

        btnCancel.setText("Cancelar");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        PassRegLabel1.setText("Confirmar Senha:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtRegPass, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)
                                .addGap(87, 87, 87)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailRegLabel)
                                    .addComponent(txtEmailReg, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(PassRegLabel1)
                                    .addComponent(txtRegPassConfirm)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnRegReg)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCancel))
                            .addComponent(UserRegLabel))
                        .addGap(253, 253, 253))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUserReg, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PassRegLabel))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(emailRegLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtEmailReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(PassRegLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegPassConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(UserRegLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUserReg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(PassRegLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegReg)
                    .addComponent(btnCancel))
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserRegActionPerformed

    private void btnRegRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegRegActionPerformed

        //Verificar se os campos estão vazios
        if (txtUserReg.getText().isEmpty() || txtEmailReg.getText().isEmpty() || String.valueOf(txtRegPass.getPassword()).isEmpty() || String.valueOf(txtRegPassConfirm.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(null, "Não deixe campos vazios!");
            return;
        }
        //Cadastrar usuário
        try {
            if(String.valueOf(txtRegPass.getPassword()).equals(String.valueOf(txtRegPassConfirm.getPassword()))){
                UsuarioDAO dao = new UsuarioDAO();
                Usuario usuario = new Usuario();
                usuario.setUsername(txtUserReg.getText());
                usuario.setEmail(txtEmailReg.getText());
                usuario.setPassword(txtRegPass.getText());
                dao.cadastrarUsuario(usuario);
                // Voltar para a tela de login caso for um sucesso
                this.setVisible(false);
                new Login().setVisible(true);
            }
            else{
                JOptionPane.showMessageDialog(null, "Senhas Diferentes!");
            }
            
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }//GEN-LAST:event_btnRegRegActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        this.setVisible(false);
        new Login().setVisible(true);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtEmailRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailRegActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailRegActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PassRegLabel;
    private javax.swing.JLabel PassRegLabel1;
    private javax.swing.JLabel UserRegLabel;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRegReg;
    private javax.swing.JLabel emailRegLabel;
    private javax.swing.JTextField txtEmailReg;
    private javax.swing.JPasswordField txtRegPass;
    private javax.swing.JPasswordField txtRegPassConfirm;
    private javax.swing.JTextField txtUserReg;
    // End of variables declaration//GEN-END:variables
}
