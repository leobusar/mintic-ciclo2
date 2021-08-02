/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.util.ArrayList;

/**
 *
 * @author leobusta
 */
public class Barrio {
    protected String nombre;
    protected String ciudad;
    protected String localidad;
    protected int estrato;
    protected ArrayList<Direccion> direccion;

    public Barrio(String nombre, String ciudad, String localidad, int estrato) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.localidad = localidad;
        this.estrato = estrato;
    }
    
    
}
