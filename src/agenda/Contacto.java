/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.Objects;

/**
 *
 * @author faustoperillo
 */
public class Contacto {
    
    private String nombre;
    private String telefono;
    private Tipo tipo;

    public Contacto(String nombre, String telefono, Tipo tipo) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.tipo = tipo;
    }
    
    public boolean validar() {
        return false;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contacto other = (Contacto) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.telefono, other.telefono)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        return true;
    }

    
    
    
}
