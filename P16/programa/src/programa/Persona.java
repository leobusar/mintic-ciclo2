/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

/**
 *
 * @author leobusta
 */
public class Persona {
    private String nombre;
    private int edad; 
    private String genero; 
    private String barrio;

    public Persona(String nombre, int edad, String genero, String barrio) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.barrio = barrio;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", barrio=" + barrio ;
    }
 
    
    
}
