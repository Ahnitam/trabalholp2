/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pctFormulario;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pctControle.Estudio;
import pctControle.Usuario;
import pctDAO.GlobalDAO;

/**
 *
 * @author Luis Henrique
 */
public class GerenciaEstudio extends javax.swing.JFrame {

    /**
     * Creates new form GerenciaEstudio
     */
    private String comp = "";
    private List<Estudio> lista = null;
    private Usuario user;

    public GerenciaEstudio(Usuario user) {
        this.user = user;
        initComponents();
        ListarEstudios();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCadastraEstudio = new javax.swing.JButton();
        btnExcluirEstudio = new javax.swing.JButton();
        btnToHomeEstudio = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        estudioTable = new javax.swing.JTable();
        digitaEstudioLabel = new javax.swing.JLabel();
        txtDigitaEstudio = new javax.swing.JTextField();
        estudioLabel = new javax.swing.JLabel();
        txtEstudio = new javax.swing.JTextField();
        btnUpdateEstudio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gerenciar Estudio");
        setResizable(false);

        btnCadastraEstudio.setText("Cadatrar Estudio");
        btnCadastraEstudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastraEstudioActionPerformed(evt);
            }
        });

        btnExcluirEstudio.setText("Excluir");
        btnExcluirEstudio.setEnabled(false);
        btnExcluirEstudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirEstudioActionPerformed(evt);
            }
        });

        btnToHomeEstudio.setText("Voltar pra Home");
        btnToHomeEstudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnToHomeEstudioActionPerformed(evt);
            }
        });

        estudioTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdEstudio", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        estudioTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        estudioTable.getTableHeader().setReorderingAllowed(false);
        estudioTable.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                estudioTableFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(estudioTable);
        if (estudioTable.getColumnModel().getColumnCount() > 0) {
            estudioTable.getColumnModel().getColumn(0).setResizable(false);
            estudioTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            estudioTable.getColumnModel().getColumn(1).setResizable(false);
            estudioTable.getColumnModel().getColumn(1).setPreferredWidth(550);
        }

        digitaEstudioLabel.setText("Digite o nome do Estudio:");

        txtDigitaEstudio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDigitaEstudioFocusGained(evt);
            }
        });
        txtDigitaEstudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDigitaEstudioActionPerformed(evt);
            }
        });
        txtDigitaEstudio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDigitaEstudioKeyReleased(evt);
            }
        });

        estudioLabel.setText("Estudio");

        txtEstudio.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEstudioFocusGained(evt);
            }
        });
        txtEstudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEstudioActionPerformed(evt);
            }
        });

        btnUpdateEstudio.setText("Atualizar");
        btnUpdateEstudio.setEnabled(false);
        btnUpdateEstudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateEstudioActionPerformed(evt);
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
                                .addComponent(txtEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCadastraEstudio))
                            .addComponent(estudioLabel))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtDigitaEstudio)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(btnToHomeEstudio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdateEstudio)
                        .addGap(31, 31, 31)
                        .addComponent(btnExcluirEstudio)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(digitaEstudioLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDigitaEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(estudioLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEstudio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCadastraEstudio))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnToHomeEstudio)
                    .addComponent(btnExcluirEstudio)
                    .addComponent(btnUpdateEstudio))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEstudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEstudioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEstudioActionPerformed

    private void txtDigitaEstudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDigitaEstudioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDigitaEstudioActionPerformed

    private void btnCadastraEstudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastraEstudioActionPerformed
        if (txtEstudio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Campo vazio!");
            return;
        }
        try {
            int a = JOptionPane.showConfirmDialog(null, "Deseja Cadastrar?\nEstúdio: " + txtEstudio.getText());
            if (a == 0) {
                GlobalDAO.getInstance().estudioDAO.cadastrarEstudio(txtEstudio.getText());
                LimparCampoCadastro();
                ListarEstudios();
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnCadastraEstudioActionPerformed

    private void txtDigitaEstudioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDigitaEstudioKeyReleased
        if (!txtDigitaEstudio.getText().equals(this.comp) && txtDigitaEstudio.getText().isEmpty()) {
            ListarEstudios();
        } else if (!txtDigitaEstudio.getText().equals(this.comp)) {
            ListarEstudios(txtDigitaEstudio.getText());
        }
        this.comp = txtDigitaEstudio.getText();
    }//GEN-LAST:event_txtDigitaEstudioKeyReleased

    private void btnExcluirEstudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirEstudioActionPerformed
        int a = JOptionPane.showConfirmDialog(null, "Deseja Excluir?\nEstudio: " + estudioTable.getValueAt(estudioTable.getSelectedRow(), 1).toString());
        if (a == 0) {
            DefaultTableModel dados = (DefaultTableModel) estudioTable.getModel();
            Estudio estudio = new Estudio(Integer.valueOf(estudioTable.getValueAt(estudioTable.getSelectedRow(), 0).toString()), estudioTable.getValueAt(estudioTable.getSelectedRow(), 1).toString());

            GlobalDAO.getInstance().estudioDAO.excluirEstudio(estudio);
            if (!txtDigitaEstudio.getText().isEmpty()) {
                lista.remove((Estudio) estudioTable.getValueAt(estudioTable.getSelectedRow(), 1));
                dados.removeRow(estudioTable.getSelectedRow());
                ListarEstudios(txtDigitaEstudio.getText());
            } else {
                ListarEstudios();
            }
        }
    }//GEN-LAST:event_btnExcluirEstudioActionPerformed

    private void btnUpdateEstudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateEstudioActionPerformed
        Estudio estudio = new Estudio(Integer.valueOf(estudioTable.getValueAt(estudioTable.getSelectedRow(), 0).toString()), estudioTable.getValueAt(estudioTable.getSelectedRow(), 1).toString());
        Estudio oldestudio = GlobalDAO.getInstance().estudioDAO.BuscarEstudioById(Integer.valueOf(estudioTable.getValueAt(estudioTable.getSelectedRow(), 0).toString()));
        if (oldestudio.getNome().equals(estudio.getNome())) {
            JOptionPane.showMessageDialog(null, "Faça uma alteração na tabela para atualizar!");
        } else {
            int a = JOptionPane.showConfirmDialog(null, "Deseja Atualizar?\nDe: " + oldestudio.getNome() + "\nPara: " + estudio.getNome());
            if (a == 0) {
                GlobalDAO.getInstance().estudioDAO.atualizarEstudio(estudio);
                txtDigitaEstudio.setText("");
                ListarEstudios();
            }
        }
    }//GEN-LAST:event_btnUpdateEstudioActionPerformed

    private void estudioTableFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_estudioTableFocusGained
        btnExcluirEstudio.setEnabled(true);
        btnUpdateEstudio.setEnabled(true);
    }//GEN-LAST:event_estudioTableFocusGained

    private void btnToHomeEstudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnToHomeEstudioActionPerformed
        new HomeAdm(this.user).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnToHomeEstudioActionPerformed

    private void txtDigitaEstudioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDigitaEstudioFocusGained
        BloquearButtons();
    }//GEN-LAST:event_txtDigitaEstudioFocusGained

    private void txtEstudioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEstudioFocusGained
        BloquearButtons();
    }//GEN-LAST:event_txtEstudioFocusGained

    private void LimparCampoCadastro() {
        txtEstudio.setText("");
    }

    private void BloquearButtons() {
        btnExcluirEstudio.setEnabled(false);
        btnUpdateEstudio.setEnabled(false);
        estudioTable.clearSelection();
    }

    private void ListarEstudios() {
        BloquearButtons();
        DefaultTableModel dados = (DefaultTableModel) estudioTable.getModel();
        dados.setNumRows(0);

        lista = GlobalDAO.getInstance().estudioDAO.listarEstudios();

        lista.forEach((estudio) -> {
            dados.addRow(new Object[]{
                estudio.getIdestudio(),
                estudio
            });
        });
    }

    private void ListarEstudios(String s) {
        BloquearButtons();
        DefaultTableModel dados = (DefaultTableModel) estudioTable.getModel();
        dados.setNumRows(0);

        lista.forEach((estudio) -> {
            if (estudio.getNome().toLowerCase().contains(s.toLowerCase())) {
                dados.addRow(new Object[]{
                    estudio.getIdestudio(),
                    estudio
                });
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastraEstudio;
    private javax.swing.JButton btnExcluirEstudio;
    private javax.swing.JButton btnToHomeEstudio;
    private javax.swing.JButton btnUpdateEstudio;
    private javax.swing.JLabel digitaEstudioLabel;
    private javax.swing.JLabel estudioLabel;
    private javax.swing.JTable estudioTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtDigitaEstudio;
    private javax.swing.JTextField txtEstudio;
    // End of variables declaration//GEN-END:variables
}
