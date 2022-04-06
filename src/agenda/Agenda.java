package agenda;

import java.util.ArrayList;

/**
 *
 * @author faustoperillo
 */
public class Agenda {

    private ArrayList<Contacto> contactos = new ArrayList();
    
    public int cantidadContactos(){
        return contactos.size();
    }
    
    public boolean crearContacto(String nombre, String telefono, Tipo tipo){
        return false;
    }  
}
