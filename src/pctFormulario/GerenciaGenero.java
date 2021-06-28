/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pctFormulario;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pctControle.Genero;
import pctControle.Usuario;
import pctDAO.GeneroDAO;

/**
 *
 * @author Luis Henrique
 */
public class GerenciaGenero extends javax.swing.JFrame {

    /**
     * Creates new form GerenciaEstudio
     */
    private String comp = "";
    private List<Genero> lista = null;
    private Usuario user;
    
    public GerenciaGenero(Usuario user) {
        this.user = user;
        initComponents();
        ListarGeneros();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCadastraGenero = new javax.swing.JButton();
        btnExcluirGenero = new javax.swing.JButton();
        btnToHomeEstudio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        generoTable = new javax.swing.JTable();
        digitaEstudioLabel = new javax.swing.JLabel();
        txtDigitaGenero = new javax.swing.JTextField();
        estudioLabel = new javax.swing.JLabel();
        txtGenero = new javax.swing.JTextField();
        btnUpdateGenero = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnCadastraGenero.setText("Cadatrar Gênero");
        btnCadastraGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastraGeneroActionPerformed(evt);
            }
        });

        btnExcluirGenero.setText("Excluir");
        btnExcluirGenero.setEnabled(false);
        btnExcluirGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirGeneroActionPerformed(evt);
            }
        });

        btnToHomeEstudio.setText("Voltar pra Home");
        btnToHomeEstudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToHomeEstudioActionPerformed(evt);
            }
        });

        generoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdGênero", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        generoTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        generoTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                generoTableFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(generoTable);
        if (generoTable.getColumnModel().getColumnCount() > 0) {
            generoTable.getColumnModel().getColumn(0).setResizable(false);
            generoTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            generoTable.getColumnModel().getColumn(1).setResizable(false);
            generoTable.getColumnModel().getColumn(1).setPreferredWidth(550);
        }

        digitaEstudioLabel.setText("Digite o nome do Gênero:");

        txtDigitaGenero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDigitaGeneroFocusGained(evt);
            }
        });
        txtDigitaGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDigitaGeneroActionPerformed(evt);
            }
        });
        txtDigitaGenero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDigitaGeneroKeyReleased(evt);
            }
        });

        estudioLabel.setText("Gênero");

        txtGenero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtGeneroFocusGained(evt);
            }
        });
        txtGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeneroActionPerformed(evt);
            }
        });

        btnUpdateGenero.setText("Atualizar");
        btnUpdateGenero.setEnabled(false);
        btnUpdateGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateGeneroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(digitaEstudioLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCadastraGenero))
                            .addComponent(estudioLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtDigitaGenero)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnToHomeEstudio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdateGenero)
                        .addGap(36, 36, 36)
                        .addComponent(btnExcluirGenero)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(digitaEstudioLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDigitaGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estudioLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastraGenero))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnToHomeEstudio)
                    .addComponent(btnExcluirGenero)
                    .addComponent(btnUpdateGenero))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeneroActionPerformed

    private void txtDigitaGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDigitaGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDigitaGeneroActionPerformed

    private void btnCadastraGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastraGeneroActionPerformed
        if (txtGenero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo vazio!");
            return;
        }
        try{
            int a = JOptionPane.showConfirmDialog(null, "Deseja Cadastrar?\nGenero: "+txtGenero.getText());
            if (a == 0){
                GeneroDAO dao = new GeneroDAO();
                dao.cadastrarGenero(txtGenero.getText());
                LimparCampoCadastro();
                ListarGeneros();
            }
        }catch(Exception e){
            
        }
        
        
    }//GEN-LAST:event_btnCadastraGeneroActionPerformed

    private void txtDigitaGeneroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDigitaGeneroKeyReleased
        if(!txtDigitaGenero.getText().equals(this.comp) && txtDigitaGenero.getText().isEmpty()){
            ListarGeneros();
        }else if(!txtDigitaGenero.getText().equals(this.comp)){
            ListarGeneros(txtDigitaGenero.getText());
        }
        this.comp = txtDigitaGenero.getText();
        
    }//GEN-LAST:event_txtDigitaGeneroKeyReleased

    private void btnExcluirGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirGeneroActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Deseja Excluir?\nGenero: "+generoTable.getValueAt(generoTable.getSelectedRow(), 1).toString());
        if (a == 0){
            DefaultTableModel dados = (DefaultTableModel) generoTable.getModel();
            Genero genero = new Genero(Integer.valueOf(generoTable.getValueAt(generoTable.getSelectedRow(), 0).toString()), generoTable.getValueAt(generoTable.getSelectedRow(), 1).toString());
            GeneroDAO dao = new GeneroDAO();
            
            dao.excluirGenero(genero);
            if (!txtDigitaGenero.getText().isEmpty()){
                lista.remove((Genero) generoTable.getValueAt(generoTable.getSelectedRow(), 1));
                dados.removeRow(generoTable.getSelectedRow());
                ListarGeneros(txtDigitaGenero.getText());
            }else{
                ListarGeneros();
            }
        }
    }//GEN-LAST:event_btnExcluirGeneroActionPerformed

    private void generoTableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_generoTableFocusGained
        btnExcluirGenero.setEnabled(true);
        btnUpdateGenero.setEnabled(true);
    }//GEN-LAST:event_generoTableFocusGained

    private void btnUpdateGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateGeneroActionPerformed
        Genero genero = new Genero(Integer.valueOf(generoTable.getValueAt(generoTable.getSelectedRow(), 0).toString()), generoTable.getValueAt(generoTable.getSelectedRow(), 1).toString());
        GeneroDAO dao = new GeneroDAO();
        Genero oldgenero = dao.BuscarGeneroById(Integer.valueOf(generoTable.getValueAt(generoTable.getSelectedRow(), 0).toString()));
        if (oldgenero.getNome().equals(genero.getNome())){
            JOptionPane.showMessageDialog(null, "Faça uma alteração na tabela para atualizar!");
        }else{
            int a = JOptionPane.showConfirmDialog(null, "Deseja Atualizar?\nDe: "+oldgenero.getNome()+"\nPara: "+genero.getNome());
            if (a == 0){
                dao.atualizarGenero(genero);
                ListarGeneros();
            }
        }
        
    }//GEN-LAST:event_btnUpdateGeneroActionPerformed

    private void btnToHomeEstudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToHomeEstudioActionPerformed
        new HomeAdm(this.user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnToHomeEstudioActionPerformed

    private void txtDigitaGeneroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDigitaGeneroFocusGained
        BloquearButtons();
    }//GEN-LAST:event_txtDigitaGeneroFocusGained

    private void txtGeneroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtGeneroFocusGained
        BloquearButtons();
    }//GEN-LAST:event_txtGeneroFocusGained

    private void LimparCampoCadastro(){
        txtGenero.setText("");
    }
    
    private void BloquearButtons(){
        btnExcluirGenero.setEnabled(false);
        btnUpdateGenero.setEnabled(false);
        generoTable.clearSelection();
    }
    
    private void ListarGeneros(){
        BloquearButtons();
        DefaultTableModel dados = (DefaultTableModel) generoTable.getModel();
        dados.setNumRows(0);
        
        GeneroDAO dao = new GeneroDAO();
        this.lista = dao.listarGeneros();
        
        this.lista.forEach((genero) -> {
            dados.addRow(new Object[]{
                genero.getIdcategoria(),
                genero.getNome()
            });
        });
    }
    private void ListarGeneros(String s){
        BloquearButtons();
        DefaultTableModel dados = (DefaultTableModel) generoTable.getModel();
        dados.setNumRows(0);

        this.lista.forEach((genero) -> {
            dados.addRow(new Object[]{
                genero.getIdcategoria(),
                genero.getNome()
            });
        });
    }
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
            java.util.logging.Logger.getLogger(GerenciaGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciaGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciaGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciaGenero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciaGenero(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastraGenero;
    private javax.swing.JButton btnExcluirGenero;
    private javax.swing.JButton btnToHomeEstudio;
    private javax.swing.JButton btnUpdateGenero;
    private javax.swing.JLabel digitaEstudioLabel;
    private javax.swing.JLabel estudioLabel;
    private javax.swing.JTable generoTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDigitaGenero;
    private javax.swing.JTextField txtGenero;
    // End of variables declaration//GEN-END:variables
}
