package pctControle;
/**
 *
 * @author Luis Henrique
 */
public class Review {
    private int idreview;
    private String descricao;
    private int nota;
    private String user;

    public Review(int idreview, String descricao, int nota, String user) {
        this.idreview = idreview;
        this.descricao = descricao;
        this.nota = nota;
        this.user = user;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
    public int getIdReview() {
        return idreview;
    }

    public void setIdReview(int idReview) {
        this.idreview = idReview;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return this.descricao;
    }
    
}
