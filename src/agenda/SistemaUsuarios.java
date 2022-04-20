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
public class SistemaUsuarios {
    
    private ArrayList<Usuario> usuarios = new ArrayList();
    
    public Usuario login(String usuario, String password){
        
        for (Usuario u : usuarios){
            if (usuario.equals(u.getNombre()) && password.equals(u.getPassword())){
                return u;
            }
        }
        return null;
    }
    
    public boolean crearUsuario(String nombreCompleto, String nombre, String password){
        return usuarios.add(new Usuario(nombreCompleto,nombre, password));
    }
}
