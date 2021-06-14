package pctControle;
/**
 *
 * @author Luis Henrique
 */
public class Estudio {
    int idestudio;
    String nome;

    public Estudio(int idestudio, String nome) {
        this.idestudio = idestudio;
        this.nome = nome;
    }
    
    public int getIdestudio() {
        return idestudio;
    }

    public void setIdestudio(int idestudio) {
        this.idestudio = idestudio;
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
