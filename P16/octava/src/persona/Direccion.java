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
public class Direccion {
    String parte1;
    String parte2; 
    Barrio barrio;
    protected double coord_x;
    protected double coord_y;
    
    public Direccion(String parte1, String parte2, Barrio barrio) {
        this.parte1 = parte1;
        this.parte2 = parte2;
        this.barrio = barrio;
    }
    
    
    
}
