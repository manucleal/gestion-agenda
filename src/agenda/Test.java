package agenda;

/**
 *
 * @author faustoperillo
 */
public class Test {
    
    public static void main(){
    
        Fachada instancia = Fachada.getInstancia();
        Usuario u1 = instancia.login("Emanuel Coitiño", "Emanuel");
        Usuario u2 = instancia.login("Fausto Perillo", "Fausto");
        
        //traerlos de los tipos con un get
        Tipo laboral = instancia.getTipos().get(0);
        Tipo particular = instancia.getTipos().get(1);
        Tipo familiar = instancia.getTipos().get(2);
        
        Agenda agendaEma = u1.getAgenda();
        agendaEma.crearContacto("Fernanda", "098765", laboral);
        agendaEma.crearContacto("Juampi", "0998765", particular);
        agendaEma.crearContacto("Tadeo", "0987777", familiar);
        
        Agenda agendaFaus = u2.getAgenda();
        agendaFaus.crearContacto("Bruno", "0987655", familiar);
        agendaFaus.crearContacto("Camila", "098766", particular);
        agendaFaus.crearContacto("Carlos", "0987665", laboral);
    
    }

    
}
