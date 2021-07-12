/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pctDAO;

/**
 *
 * @author jlucaso
 */
public class GlobalDAO {

    public AnimeDAO animeDAO;
    public EstudioDAO estudioDAO;
    public GeneroDAO generoDAO;
    public ReviewDAO reviewDAO;
    public UsuarioDAO usuarioDAO;

    private static GlobalDAO instance;

    GlobalDAO() {
        animeDAO = new AnimeDAO();
        estudioDAO = new EstudioDAO();
        generoDAO = new GeneroDAO();
        reviewDAO = new ReviewDAO();
        usuarioDAO = new UsuarioDAO();
    }

    public static GlobalDAO getInstance() {
        if (instance == null) {
            instance = new GlobalDAO();
        }
        return instance;
    }
}
