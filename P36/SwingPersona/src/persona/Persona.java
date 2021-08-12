/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;


/**
 *
 * @author leobusta
 */
public class Persona {
    private String nombre;
    private int edad;
    private String genero;
    private String email;
    private String ocupacion;

    public Persona(String nombre, int edad, String genero, String email, String ocupacion) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.email = email;
        this.ocupacion = ocupacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public String getEmail() {
        return email;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", email=" + email + ", ocupacion=" + ocupacion + '}';
    }
    
}
