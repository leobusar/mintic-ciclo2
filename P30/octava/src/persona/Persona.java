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
    protected int cedula;
    protected int edad;
    protected String nombre;
    protected Direccion  direccion; 

    public Persona(int cedula, int edad, String nombre, Direccion direccion) {
        this.cedula = cedula;
        this.edad = edad;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    
}
