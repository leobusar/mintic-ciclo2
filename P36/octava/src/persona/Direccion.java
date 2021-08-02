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
    String tipoavenida;
    String nroavenida;
    String nomenclatura;
    Barrio barrio;
    Persona[] personas;

    public Direccion(String tipoavenida, String nroavenida, String nomenclatura) {
        this.tipoavenida = tipoavenida;
        this.nroavenida = nroavenida;
        this.nomenclatura = nomenclatura;
        this.personas = new Persona[10];
        double[] calificaciones = new double[10];
    }
    
}
