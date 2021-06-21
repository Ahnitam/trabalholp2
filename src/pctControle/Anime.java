package pctControle;

import java.util.List;

/**
 *
 * @author Luis Henrique
 */
public class Anime {
int idanime;
String name;
String sinopse;
String f_etaria;
double media;
Estudio estudio;
List<Genero> generos;

    public Anime(int idanime, String name, String sinopse, String f_etaria, double media, Estudio estudio, List<Genero> generos) {
        this.idanime = idanime;
        this.name = name;
        this.sinopse = sinopse;
        this.f_etaria = f_etaria;
        this.media = media;
        this.estudio = estudio;
        this.generos = generos;
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
