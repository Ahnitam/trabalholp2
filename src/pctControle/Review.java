package pctControle;

import java.util.Calendar;

/**
 *
 * @author Luis Henrique
 */
public class Review {
    private int idreview;
    private String descricao;
    private int nota;
    private String user;
    private int id_Anime;
    private int id_user;
    private Calendar data;

    public Review(int idreview, String descricao, int nota, String user, int id_Anime, int id_user, long data) {
        this.idreview = idreview;
        this.descricao = descricao;
        this.nota = nota;
        this.user = user;
        this.id_Anime = id_Anime;
        this.id_user = id_user;
        this.data = Calendar.getInstance();
        this.data.setTimeInMillis(data);
    }
    public Review(int idreview, String descricao, int nota, String user, int id_Anime, int id_user, Calendar data) {
        this.idreview = idreview;
        this.descricao = descricao;
        this.nota = nota;
        this.user = user;
        this.id_Anime = id_Anime;
        this.id_user = id_user;
        this.data = data;
    }

    public Calendar getData() {
        return data;
    }
    
    public String getDataString() {
        String dia = String.valueOf(this.data.get(Calendar.DAY_OF_MONTH));
        String mes = String.valueOf(this.data.get(Calendar.MONTH)+1);
        if (dia.length() == 1){
            dia = "0"+dia;
        }
        if (mes.length() == 1){
            mes = "0"+mes;
        }
        return dia+"/"+mes+"/"+this.data.get(Calendar.YEAR);
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    
    public int getId_Anime() {
        return id_Anime;
    }

    public void setId_Anime(int id_Anime) {
        this.id_Anime = id_Anime;
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
