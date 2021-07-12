package pctControle;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Luis Henrique
 */
public class Anime {
private int idanime;
private String name;
private String sinopse;
private String f_etaria;
private double media;
private Estudio estudio;
private Calendar data = Calendar.getInstance();
private List<Genero> generos;
private String urlImagem;

    public Anime(int idanime, String name, String sinopse, String f_etaria, double media, Estudio estudio, Date data, List<Genero> generos, String urlImagem) {
        this.idanime = idanime;
        this.name = name;
        this.sinopse = sinopse;
        this.f_etaria = f_etaria;
        this.media = media;
        this.estudio = estudio;
        this.data.setTime(data);
        this.generos = generos;
        this.urlImagem = urlImagem;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
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

    public Estudio getEstudio() {
        return estudio;
    }

    public void setEstudio(Estudio estudio) {
        this.estudio = estudio;
    }
    
    public int getIdanime() {
        return idanime;
    }

    public void setIdanime(int idanime) {
        this.idanime = idanime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getF_etaria() {
        return f_etaria;
    }

    public void setF_etaria(String f_etaria) {
        this.f_etaria = f_etaria;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public List<Genero> getGeneros() {
        return generos;
    }
    public String Generos(){
        String gen = "";
        for (int i = 0; i < this.generos.size(); i++){
            if (i == 0){
                gen += this.generos.get(i).getNome();
            }else{
                gen += ", "+this.generos.get(i).getNome();
            }
        }
        return gen;
    }

    public void setGeneros(List<Genero> generos) {
        this.generos = generos;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
