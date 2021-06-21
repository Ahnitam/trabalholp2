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
            return DriverManager.getConnection("jdbc:mysql://qao3ibsa7hhgecbv.cbetxkdyhwsb.us-east-1.rds.amazonaws.com/eq18mg5k2kohtbty?useSSL=false", "i0f77me556t0n10j", "nqviomfpypg5x0yl");
        } catch (SQLException erro) {
            throw new RuntimeException(erro);
        }
    }
}
//mysql://i0f77me556t0n10j:nqviomfpypg5x0yl@qao3ibsa7hhgecbv.cbetxkdyhwsb.us-east-1.rds.amazonaws.com:3306/eq18mg5k2kohtbty