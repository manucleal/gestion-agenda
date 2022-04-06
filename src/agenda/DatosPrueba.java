package agenda;

/**
 *
 * @author faustoperillo
 */
public class DatosPrueba {
    
    public static void cargar(){
        Fachada fachada = Fachada.getInstancia();
        
        fachada.crearUsuario("Emanuel Coitiño", "Emanuel", "Ema123");
        fachada.crearUsuario("Fausto Perillo", "Fausto", "Faus123" );
        
        fachada.crearTipo("Laboral");
        fachada.crearTipo("Particular");
        fachada.crearTipo("Familiar");
        
        

       
    }
    
}
