package pctConexao;
/**
 *
 * @author Luis Henrique
 */
import pctConexao.Conexao;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Test {
    
    public static void main(String[] args) {
         try { 
             new Conexao().getConnection();
             JOptionPane.showMessageDialog(null, "Conectado com sucesso!");             
         } catch (HeadlessException erro) {
              JOptionPane.showMessageDialog(null, " erro: "  + erro);    
         }
}
}