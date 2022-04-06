package agenda;

import java.util.ArrayList;

/**
 *
 * @author faustoperillo
 */
public class SistemaAgendas {
    
    private ArrayList<Tipo> tipos = new ArrayList();
    
    public boolean crearTipo(String nombre){
        return tipos.add(new Tipo(nombre));
    }
    
    public ArrayList<Tipo> getTipos() {
        return tipos;
    }
    
}
