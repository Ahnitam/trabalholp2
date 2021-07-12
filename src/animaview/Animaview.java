package animaview;

import pctDAO.GlobalDAO;
import pctFormulario.Login;

/**
 *
 * @author Luis Henrique
 */
public class Animaview {

    public static void main(String[] args) {
        GlobalDAO.getInstance();
        new Login().setVisible(true);
    }

}
