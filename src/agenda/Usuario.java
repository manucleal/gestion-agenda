/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author faustoperillo
 */
public class Usuario {
    
    private String nombreCompleto;
    private String nombre;
    private String password;
    private Agenda agenda = new Agenda();

    public Usuario(String nombreCompleto, String nombre, String password) {
        this.nombreCompleto = nombreCompleto;
        this.nombre = nombre;
        this.password = password;
    }

    public Agenda getAgenda() {
        return agenda;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }
    
    
    
}
