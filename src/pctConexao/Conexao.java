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
            return DriverManager.getConnection("jdbc:mysql://remotemysql.com/0TPmdlvjbi?autoReconnect=true&useSSL=false", "0TPmdlvjbi", "MgAO6lP8rK");
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
}
