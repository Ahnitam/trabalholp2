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
import pctControle.Usuario;

/**
 *
 * @author Administrator
 */
public class UsuarioDAO {

    private Connection con;

    public UsuarioDAO() {
        this.con = new Conexao().getConnection();
    }

    // método  para salvar os registros
    public void cadastrarUsuario(Usuario usuario) {
        try {

            //Primeiro  passo  - criar o comando sql
            String sql = "insert into usuario (username,email,password) "
                    + " values (?,?,?)";

            //Segundo  passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);

            stmt.setString(1, usuario.getUsername());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getPassword());

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

    public void excluirUsuario(Usuario usuario) {
        try {

            // Primeiro  passo  - criar o comando sql
            String sql = "delete from usuario where iduser = ?";

            //Segundo passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, usuario.getIduser());

            //Teceiro passo - executar o comando sql
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Dados Excluido com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no banco de dados: " + erro);

        }
    }

    // Método para atualização de registro
    public void atualizarCliente(Usuario usuario) {
        try {

            //Primeiro  passo  - criar o comando sql
            String sql = "update usuario set username=?, email=?, password=?, permission=? where iduser=?";

            //Segundo  passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, usuario.getUsername());
            stmt.setString(2, usuario.getEmail());
            stmt.setString(3, usuario.getPassword());
            stmt.setInt(4, usuario.getPermission());
            stmt.setInt(5, usuario.getIduser());

            //Terceiro  passo - executar o comando sql
            stmt.executeUpdate();
            stmt.close();

            JOptionPane.showMessageDialog(null, "atualizado com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no banco de dados: " + erro);

        }
    }

    // método para o preenchimento da tabela
    public List<Usuario> listarClientes() {
        List<Usuario> lista = new ArrayList<>();

        String sql = "select iduser, username, email, password, permission from usuario";
        try {
            //Segundo  passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                Usuario usuario = new Usuario();
                usuario.setIduser(rs.getInt("iduser"));
                usuario.setUsername(rs.getString("username"));
                usuario.setEmail(rs.getString("email"));
                usuario.setPassword(rs.getString("password"));
                usuario.setPermission(rs.getInt("permission"));
                lista.add(usuario);
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }

    public Usuario VerificarUsuario(String username) {
        String sql = "select iduser, username, email, password, permission from usuario where username=?";
        try {
            //Segundo  passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            if(rs.next() == false){
                return null;
            }
            Usuario usuario = new Usuario();
            usuario.setIduser(rs.getInt("iduser"));
            usuario.setUsername(rs.getString("username"));
            usuario.setEmail(rs.getString("email"));
            usuario.setPassword(rs.getString("password"));
            usuario.setPermission(rs.getInt("permission"));
            return usuario;
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

}
