/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.util.List;

/**
 *
 * @author leobusta
 */
public class Barrio {
    protected int postal;
    protected String  nombre;
    protected int area;
    protected List<Direccion> direcciones;

    public Barrio(int postal, String nombre, int area, List<Direccion> direcciones) {
        this.postal = postal;
        this.nombre = nombre;
        this.area = area;
    }
    
    
}
