package pctControle;
/**
 *
 * @author Luis Henrique
 */
public class Genero {
    int idcategoria;
    String nome;

    public Genero(int idcategoria, String nome) {
        this.idcategoria = idcategoria;
        this.nome = nome;
    }

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
    
    
}
