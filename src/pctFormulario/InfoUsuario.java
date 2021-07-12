/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pctFormulario;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import pctControle.Usuario;
import pctDAO.UsuarioDAO;

/**
 *
 * @author Luis Henrique
 */
public class InfoUsuario extends javax.swing.JFrame {

    /**
     * Creates new form HomeAdm
     */
    private Usuario user;
    
    public InfoUsuario(Usuario user) {
        this.user = user;
        initComponents();
        preencherValores();
        visibilidadeConfirmSenha(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        buttonGroup3 = new javax.swing.ButtonGroup();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabelConfirmSenha = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jPasswordSenha = new javax.swing.JPasswordField();
        jPasswordConfirmSenha = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Informações Usuário");
        setResizable(false);

        btnBack.setText("Home");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setText("Usuário:");

        textUser.setEnabled(false);

        jLabel2.setText("Email:");

        textEmail.setEnabled(false);

        jLabel3.setText("Senha:");

        jLabelConfirmSenha.setText("Confirme a Senha Atual:");
        jLabelConfirmSenha.setOpaque(true);

        btnUpdate.setText("Editar");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jPasswordSenha.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(textUser, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(140, 140, 140))
                            .addComponent(jPasswordSenha)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPasswordConfirmSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelConfirmSenha))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)))
                .addGap(0, 55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPasswordSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jLabelConfirmSenha)
                .addGap(8, 8, 8)
                .addComponent(jPasswordConfirmSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnCancelar)
                    .addComponent(btnBack))
                .addGap(15, 15, 15))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        new HomeUsuario(this.user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        if (btnUpdate.getText().equals("Atualizar")){
            try {
                atualizar();
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(InfoUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else {
            jPasswordSenha.setText("");
            visibilidadeConfirmSenha(true);
            textEmail.setEnabled(true);
            jPasswordSenha.setEnabled(true);
            btnUpdate.setText("Atualizar");
            btnCancelar.setEnabled(true);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.desabilitarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void desabilitarCampos(){
        preencherValores();
        visibilidadeConfirmSenha(false);
        textEmail.setEnabled(false);
        jPasswordSenha.setEnabled(false);
        btnUpdate.setText("Editar");
        btnCancelar.setEnabled(false);
        jPasswordConfirmSenha.setText("");
    }
    private void atualizar() throws NoSuchAlgorithmException{
        if (textEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo de email não pode ser vazio!");
        }else if (!ValidarEmail(textEmail.getText())){
            JOptionPane.showMessageDialog(null, "Digite um email válido!");
        }else{
            MessageDigest md = MessageDigest.getInstance("MD5");
            BigInteger hash = new BigInteger(1, md.digest(String.valueOf(jPasswordConfirmSenha.getPassword()).getBytes()));
            String senha = hash.toString(16);
            if (!senha.equals(this.user.getPassword())){
                JOptionPane.showMessageDialog(null, "Senha atual está incorreta!");
            }else if (textEmail.getText().equals(this.user.getEmail()) && String.valueOf(jPasswordSenha.getPassword()).isBlank()){
                JOptionPane.showMessageDialog(null, "Nenhuma Mudança foi feita!");
                this.desabilitarCampos();
            }else{
                if (!String.valueOf(jPasswordSenha.getPassword()).isBlank()){
                    BigInteger hash2 = new BigInteger(1, md.digest(String.valueOf(jPasswordSenha.getPassword()).getBytes()));
                    senha = hash2.toString(16);
                }            
                UsuarioDAO dao = new UsuarioDAO();
                
                if (dao.atualizarCliente(new Usuario(this.user.getIduser(), this.user.getUsername(), textEmail.getText(), senha, this.user.getPermission()))){
                    this.user.setEmail(textEmail.getText());
                    this.user.setPassword(senha);
                    this.desabilitarCampos();
                }
            }
        }
    }
    private void visibilidadeConfirmSenha(boolean b){
        jLabelConfirmSenha.setVisible(b);
        jPasswordConfirmSenha.setVisible(b);
    }
    
    private boolean ValidarEmail(String email){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$");
        return pattern.matcher(email).matches();
    }
    
    private void preencherValores(){
        textUser.setText(this.user.getUsername());
        textEmail.setText(this.user.getEmail());
        jPasswordSenha.setText(this.user.getPassword());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnUpdate;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelConfirmSenha;
    private javax.swing.JPasswordField jPasswordConfirmSenha;
    private javax.swing.JPasswordField jPasswordSenha;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textUser;
    // End of variables declaration//GEN-END:variables
}
