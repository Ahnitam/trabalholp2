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
import pctControle.Anime;
import pctControle.Genero;

/**
 *
 * @author Administrator
 */
public class GeneroDAO {

    private Connection con;

    public GeneroDAO() {
        this.con = new Conexao().getConnection();
    }

    // método  para salvar os registros
    public void cadastrarGenero(String genero) {
        try {

            //Primeiro  passo  - criar o comando sql
            String sql = "insert into genero (nome) "
                    + " values (?)";

            //Segundo  passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, genero);

            //Terceiro  passo - executar o comando sql
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado realizado com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no banco de dados: " + erro);

        }

    }

    ;
;
// Método para exclusão de registro

    public void excluirGenero(Genero genero) {
        try {

            // Primeiro  passo  - criar o comando sql
            String sql = "delete from genero where idcategoria = ?";

            //Segundo passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, genero.getIdcategoria());

            //Teceiro passo - executar o comando sql
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Dados Excluido com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no banco de dados: " + erro);

        }
    }

    // Método para atualização de registro
    public void atualizarGenero(Genero genero) {
        try {

            //Primeiro  passo  - criar o comando sql
            String sql = "update genero set nome=? where idcategoria=?";

            //Segundo  passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, genero.getNome());
            stmt.setInt(2, genero.getIdcategoria());

            //Terceiro  passo - executar o comando sql
            stmt.executeUpdate();
            stmt.close();

            JOptionPane.showMessageDialog(null, "atualizado com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no banco de dados: " + erro);

        }
    }

    // método para o preenchimento da tabela
    public List<Genero> listarGeneros() {
        List<Genero> lista = new ArrayList<>();

        String sql = "select idcategoria, nome from genero";
        try {
            //Segundo  passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Genero genero = new Genero(rs.getInt("idcategoria"), rs.getString("nome"));
                lista.add(genero);
            }
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GeneroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public List<Genero> BuscarGenero(String generoname) {
        List<Genero> lista = new ArrayList<>();
        String sql = "select idcategoria, nome from genero where nome like '%"+generoname+"%'";
        
        try {
            //Segundo  passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Genero genero = new Genero(rs.getInt("idcategoria"), rs.getString("nome"));
                lista.add(genero);
            }
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GeneroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public Genero BuscarGeneroById(int id) {
        Genero genero = null;
        String sql = "select idcategoria, nome from genero where idcategoria = ?";
        
        try {
            //Segundo  passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                genero = new Genero(rs.getInt("idcategoria"), rs.getString("nome"));
            }
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GeneroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return genero;
    }
    
    public ArrayList<Genero> BuscarGeneroByAnimeId(int id) {
        ArrayList<Genero> lista = new ArrayList<>();
        String sql = "SELECT genero.idcategoria, genero.nome FROM genero INNER JOIN anime_has_genero ON anime_has_genero.genero_idcategoria = genero.idcategoria WHERE anime_has_genero.anime_idanime = ?";
        
        try {
            //Segundo  passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                lista.add(new Genero(rs.getInt("idcategoria"), rs.getString("nome")));
            }
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GeneroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

}
