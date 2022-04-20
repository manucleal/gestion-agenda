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
        Contacto contacto = new Contacto(nombre, telefono, tipo);
        if(!contacto.validar()) return false;
        if(contactos.contains(contacto)) return false;
        contactos.add(contacto);
        return true;
    }  

    public ArrayList<Contacto> getContactos() {
        return contactos;
    }
    
}
