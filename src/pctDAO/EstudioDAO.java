/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pctDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pctConexao.Conexao;
import pctControle.Estudio;

/**
 *
 * @author Administrator
 */
public class EstudioDAO {

    private Connection con;

    public EstudioDAO() {
        this.con = new Conexao().getConnection();
    }

    // método  para salvar os registros
    public void cadastrarEstudio(String estudio) {
        try {

            //Primeiro  passo  - criar o comando sql
            String sql = "insert into estudio (nome) "
                    + " values (?)";

            //Segundo  passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, estudio);

            //Terceiro  passo - executar o comando sql
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado realizado com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no banco de dados: " + erro);
        }

    }
// Método para exclusão de registro

    public void excluirEstudio(Estudio estudio) {
        try {

            // Primeiro  passo  - criar o comando sql
            String sql = "delete from estudio where idestudio = ?";

            //Segundo passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, estudio.getIdestudio());

            //Teceiro passo - executar o comando sql
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Dados Excluido com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no banco de dados: " + erro);

        }
    }

    // Método para atualização de registro
    public void atualizarEstudio(Estudio estudio) {
        try {

            //Primeiro  passo  - criar o comando sql
            String sql = "update estudio set nome=? where idestudio=?";

            //Segundo  passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, estudio.getNome());
            stmt.setInt(2, estudio.getIdestudio());

            //Terceiro  passo - executar o comando sql
            stmt.executeUpdate();
            stmt.close();

            JOptionPane.showMessageDialog(null, "atualizado com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no banco de dados: " + erro);

        }
    }

    // método para o preenchimento da tabela
    public List<Estudio> listarEstudios() {
        List<Estudio> lista = new ArrayList<>();

        String sql = "select idestudio, nome from estudio ORDER BY nome ASC";
        try {
            //Segundo  passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Estudio estudio = new Estudio(rs.getInt("idestudio"), rs.getString("nome"));
                lista.add(estudio);
            }
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EstudioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public List<Estudio> BuscarEstudio(String estudioname) {
        List<Estudio> lista = new ArrayList<>();
        String sql = "select idestudio, nome from estudio where nome like '%"+estudioname+"%'";
        
        try {
            //Segundo  passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Estudio estudio = new Estudio(rs.getInt("idestudio"), rs.getString("nome"));
                lista.add(estudio);
            }
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EstudioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public Estudio BuscarEstudioById(int id) {
        Estudio estudio = null;
        String sql = "select idestudio, nome from estudio where idestudio = ?";
        
        try {
            //Segundo  passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                estudio = new Estudio(rs.getInt("idestudio"), rs.getString("nome"));
            }
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(EstudioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return estudio;
    }

}
