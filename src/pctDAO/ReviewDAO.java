/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pctDAO;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
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
            String sql = "insert into review (descricao, nota, usuario_iduser, anime_idanime, data) "
                    + " values (?, ?, ?, ?, ?)";

            //Segundo  passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setString(1, review);
            stmt.setInt(2, nota);
            stmt.setInt(3, user.getIduser());
            stmt.setInt(4, anime.getIdanime());
            stmt.setDate(5, new Date(System.currentTimeMillis()));
            

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
    public void excluirReview(Review review) {
        try {

            // Primeiro  passo  - criar o comando sql
            String sql = "delete from review where idreview = ?";

            //Segundo passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, review.getIdReview());

            //Teceiro passo - executar o comando sql
            stmt.execute();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Dados Excluido com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no banco de dados: " + erro);

        }
    }
    public void atualizarReview(Review review) {
        try {

            //Primeiro  passo  - criar o comando sql
            String sql = "update review set descricao=?, nota=? where idreview=?";

            //Segundo  passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, review.getDescricao());
            stmt.setInt(2, review.getNota());
            stmt.setInt(3, review.getIdReview());

            //Terceiro  passo - executar o comando sql
            stmt.executeUpdate();
            stmt.close();

            JOptionPane.showMessageDialog(null, "atualizado com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no banco de dados: " + erro);

        }
    }
    public List<Review> listarReviews(Anime anime, int iduser) {
        ArrayList<Review> lista = new ArrayList<>();

        String sql = "Select * FROM REVIEW_U WHERE anime_idanime = ? ORDER BY data ASC, idreview ASC";
        try {
            //Segundo  passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, anime.getIdanime());
            ResultSet rs = stmt.executeQuery();
            
            Review user_review = null;
            while (rs.next()) {
                if (iduser == rs.getInt("iduser")){
                    user_review = new Review(rs.getInt("idreview"), rs.getString("descricao"), rs.getInt("nota"), rs.getString("username"), rs.getInt("anime_idanime"), rs.getInt("iduser"), rs.getDate("data").getTime());
                }else{
                    lista.add(new Review(rs.getInt("idreview"), rs.getString("descricao"), rs.getInt("nota"), rs.getString("username"), rs.getInt("anime_idanime"), rs.getInt("iduser"), rs.getDate("data").getTime()));
                }
            }
            stmt.close();
            if (user_review != null){
                lista.add(user_review);
            }
            Collections.reverse(lista);
        } catch (SQLException ex) {
            Logger.getLogger(GeneroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    public List<Review> listarAllReviews(int iduser) {
        ArrayList<Review> lista = new ArrayList<>();

        String sql = "Select * FROM REVIEW_U ORDER BY data ASC, idreview ASC";
        try {
            //Segundo  passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            Review user_review = null;
            while (rs.next()) {
                if (iduser == rs.getInt("iduser")){
                    user_review = new Review(rs.getInt("idreview"), rs.getString("descricao"), rs.getInt("nota"), rs.getString("username"), rs.getInt("anime_idanime"), rs.getInt("iduser"), rs.getDate("data").getTime());
                }else{
                    lista.add(new Review(rs.getInt("idreview"), rs.getString("descricao"), rs.getInt("nota"), rs.getString("username"), rs.getInt("anime_idanime"), rs.getInt("iduser"), rs.getDate("data").getTime()));
                }
            }
            stmt.close();
            if (user_review != null){
                lista.add(user_review);
            }
            Collections.reverse(lista);
        } catch (SQLException ex) {
            Logger.getLogger(ReviewDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
}
