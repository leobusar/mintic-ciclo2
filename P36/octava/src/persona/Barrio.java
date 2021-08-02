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
public class Barrio {
    String nombre;
    Direccion[] direcciones;

    public Barrio(String nombre, Direccion[] direcciones) {
        this.nombre = nombre;
        this.direcciones = new Direccion[10];
    }
    
}
