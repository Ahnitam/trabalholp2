package pctControle;
/**
 *
 * @author Luis Henrique
 */
public class Usuario {
    int iduser;
    String username;
    String email;
    String password;
    int permission;

    public Usuario() {
    }

    
    public Usuario(int iduser, String username, String email, String password, int permission) {
        this.iduser = iduser;
        this.username = username;
        this.email = email;
        this.password = password;
        this.permission = permission;
    }

    public int getPermission() {
        return permission;
    }

    public void setPermission(int permission) {
        this.permission = permission;
    }

    public int getIduser() {
        return iduser;
    }

    public void setIduser(int iduser) {
        this.iduser = iduser;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
