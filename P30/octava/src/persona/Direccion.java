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
    protected String nomenclatura;
    protected String tipoCalle; 
    protected String nroCalle;
    protected String additional;
    protected Barrio barrio; 

    public Direccion(String nomenclatura, String tipoCalle, String nroCalle, String additional, Barrio barrio) {
        this.nomenclatura = nomenclatura;
        this.tipoCalle = tipoCalle;
        this.nroCalle = nroCalle;
        this.additional = additional;
        this.barrio = barrio;
    }
    
    

    
}
