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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pctConexao.Conexao;
import pctControle.Anime;
import pctControle.Usuario;
import pctControle.Review;

public class ReviewDAO {

    private Connection con;

    public ReviewDAO() {
        this.con = new Conexao().getConnection();
    }
    public void cadastrarReview(Usuario user,Anime anime, String review, int nota) {
        try {

            //Primeiro  passo  - criar o comando sql
            String sql = "insert into review (descricao, nota, usuario_iduser, anime_idanime) "
                    + " values (?, ?, ?, ?)";

            //Segundo  passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, review);
            stmt.setInt(2, nota);
            stmt.setInt(3, user.getIduser());
            stmt.setInt(4, anime.getIdanime());
            

            //Terceiro  passo - executar o comando sql
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Review Criada Com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no banco de dados: " + erro);
            
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    public List<Review> listarReviews(Anime anime) {
        ArrayList<Review> lista = new ArrayList<>();

        String sql = "Select idreview, username, nota, descricao FROM REVIEW_U WHERE anime_idanime = ?";
        try {
            //Segundo  passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, anime.getIdanime());
            ResultSet rs = stmt.executeQuery();
            
            GeneroDAO generodao = new GeneroDAO();
            while (rs.next()) {
                lista.add(new Review(rs.getInt("idreview"), rs.getString("descricao"), rs.getInt("nota"), rs.getString("username")));
            }
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GeneroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}
