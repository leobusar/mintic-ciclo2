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
    String nombre;
    String genero;
    int edad;   
    Direccion direccion;

    public Persona(String nombre, String genero, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }
    
}
