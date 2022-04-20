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
        
        Tipo laboral = fachada.getTipos().get(0);
        Tipo particular = fachada.getTipos().get(1);
        Tipo familiar = fachada.getTipos().get(2);
        
        Usuario u2 = fachada.login("Fausto", "Faus123");        
        Agenda agendaFaus = u2.getAgenda();
        agendaFaus.crearContacto("Bruno", "0987655", familiar);
        agendaFaus.crearContacto("Camila", "098766", particular);
        agendaFaus.crearContacto("Carlos", "0987665", laboral);

       
    }
    
}
