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
import pctControle.Genero;

public class AnimeDAO {

    private Connection con;

    public AnimeDAO() {
        this.con = new Conexao().getConnection();
    }
    public void cadastrarAnime(String nome,String sinopse, String f_etaria, int idestudio, List<Genero> generos) {
        try {

            //Primeiro  passo  - criar o comando sql
            String sql = "insert into anime (nome, sinopse, f_etaria, media, estudio_idestudio) "
                    + " values (?, ?, ?, ?, ?)";

            //Segundo  passo - conectar o banco de dados e organizar o comando sql
            PreparedStatement stmt = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            stmt.setString(1, nome);
            stmt.setString(2, sinopse);
            stmt.setString(3, f_etaria);
            stmt.setDouble(4, 0);
            stmt.setInt(5, idestudio);

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

}
