/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.ArrayList;

/**
 *
 * @author faustoperillo
 */
public class Fachada {
    
    private SistemaAgendas sAgendas = new SistemaAgendas();
    private SistemaUsuarios sUsuarios = new SistemaUsuarios();
    
    private static Fachada instancia = new Fachada();
    public static Fachada getInstancia() {
        return instancia;
    }

    public Usuario login(String usuario, String password) {
        return sUsuarios.login(usuario, password);
    }

    public boolean crearUsuario(String nombreCompleto, String nombre, String password) {
        return sUsuarios.crearUsuario(nombreCompleto, nombre, password);
    }

    public boolean crearTipo(String nombre) {
        return sAgendas.crearTipo(nombre);
    }

    public ArrayList<Tipo> getTipos() {
        return sAgendas.getTipos();
    }
    
    
    
    
}
