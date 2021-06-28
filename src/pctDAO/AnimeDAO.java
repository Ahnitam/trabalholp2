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
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import pctConexao.Conexao;
import pctControle.Anime;
import pctControle.Estudio;
import pctControle.Genero;

public class AnimeDAO {

    private Connection con;

    public AnimeDAO() {
        this.con = new Conexao().getConnection();
    }
    public void cadastrarAnime(String nome,String sinopse, String f_etaria, int idestudio, long data,List<Genero> generos) {
        try {

            //Primeiro  passo  - criar o comando sql
            String sql = "insert into anime (nome, sinopse, f_etaria, media, estudio_idestudio, data) "
                    + " values (?, ?, ?, ?, ?, ?)";

            //Segundo  passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, nome);
            stmt.setString(2, sinopse);
            stmt.setString(3, f_etaria);
            stmt.setDouble(4, 0);
            stmt.setInt(5, idestudio);
            stmt.setDate(6, new Date(data));

            //Terceiro  passo - executar o comando sql
            stmt.execute();
            
            ResultSet rs = stmt.getGeneratedKeys();
            if(rs.next()){
                Long id = rs.getLong(1);
                for (Genero genero : generos){
                    if (!anime_has_genero(id.intValue(), genero.getIdcategoria())){
                        throw new SQLException("Erro ao linkar anime com genero");
                    }
                }
            }else{
                throw new SQLException("Erro Cadastro");
            }
            stmt.close();

            JOptionPane.showMessageDialog(null, "Cadastrado realizado com Sucesso!");

        } catch (SQLException erro) {
            if ("Erro ao linkar anime com genero".equals(erro.getMessage())){
                
            }
            JOptionPane.showMessageDialog(null, "Erro no banco de dados: " + erro);
            
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
    
    protected Boolean anime_has_genero(int idanime, int idgenero){
        try {
            //Primeiro  passo  - criar o comando sql
            String sql = "insert into anime_has_genero (anime_idanime, genero_idcategoria) "
                    + " values (?, ?)";

            //Segundo  passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            
            stmt.setInt(1, idanime);
            stmt.setInt(2, idgenero);

            //Terceiro  passo - executar o comando sql
            stmt.execute();
            stmt.close();
            return true;

        } catch (Exception erro) {
            System.err.println(erro.getMessage());
            return false;
        }
    }
    public List<Anime> listarAnimes() {
        ArrayList<Anime> lista = new ArrayList<>();

        String sql = "SELECT * FROM ANIME_ESTUDIO";
        try {
            //Segundo  passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            GeneroDAO generodao = new GeneroDAO();
            while (rs.next()) {   
                Anime anime = new Anime(rs.getInt("idanime"), rs.getString("nome"), rs.getString("sinopse"), rs.getString("f_etaria"), rs.getDouble("media"), new Estudio(rs.getInt("idestudio"), rs.getString("estudio")), rs.getDate("data"),generodao.BuscarGeneroByAnimeId(rs.getInt("idanime")));
                lista.add(anime);
            }
            stmt.close();
        } catch (SQLException ex) {
            Logger.getLogger(GeneroDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lista;
    }
    
    public void AtualizarAnime(List<Genero> animeOld, Anime animeUp){
        try {
            if (animeOld.size() > 0){
                for (Genero gen : animeOld){
                    ExcluirAnime_has_Genero(animeUp.getIdanime(), gen.getIdcategoria());
                }
            }
            if (animeUp.getGeneros().size() > 0){
                for (Genero gen : animeUp.getGeneros()){
                    anime_has_genero(animeUp.getIdanime(), gen.getIdcategoria());
                }
            }
            //Primeiro  passo  - criar o comando sql
            String sql = "update anime set nome=?, sinopse=?, f_etaria=?, estudio_idestudio=?, data=? where idanime=?";
            
            //Segundo  passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, animeUp.getName());
            stmt.setString(2, animeUp.getSinopse());
            stmt.setString(3, animeUp.getF_etaria());
            stmt.setInt(4, animeUp.getEstudio().getIdestudio());
            stmt.setDate(5, new Date(animeUp.getData().getTimeInMillis()));
            stmt.setInt(6, animeUp.getIdanime());
            
            //Terceiro  passo - executar o comando sql
            stmt.executeUpdate();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no banco de dados: " + erro);
        }
    }
    
    private void ExcluirAnime_has_Genero(int idanime, int idgen){
        try{
            String sql = "DELETE FROM anime_has_genero WHERE anime_idanime=? and genero_idcategoria=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, idanime);
            stmt.setInt(2, idgen);

            //Teceiro passo - executar o comando sql
            stmt.execute();
            stmt.close();

        } catch (SQLException erro) {
            System.err.println(erro.getMessage());
        }
        
    }
    
    public void ExcluirAnime(Anime anime){
        try{
            String sql = "DELETE FROM anime WHERE idanime=?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, anime.getIdanime());

            //Teceiro passo - executar o comando sql
            stmt.execute();
            stmt.close();
            
            JOptionPane.showMessageDialog(null, "Excluido com Sucesso!");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro no banco de dados: " + erro);
        }
        
    }
    

}
