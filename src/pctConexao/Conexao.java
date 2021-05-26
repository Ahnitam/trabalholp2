package pctConexao;
/**
 *
 * @author Luis Henrique
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexao {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/animaview", "root", "root");
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
}
