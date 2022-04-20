package main;

import agenda.DatosPrueba;
import ui.Login;

/**
 *
 * @author faustoperillo
 */
public class GestionAgenda {
    
    public static void main(String[] args) throws Exception {
        DatosPrueba.cargar();
        new Login(null,false).setVisible(true);
    }
    
}
