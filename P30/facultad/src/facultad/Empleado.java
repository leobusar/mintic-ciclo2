/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facultad;

/**
 *
 * @author leobusta
 */
public class Empleado extends Persona{
    private String cargo; 
    private int sueldo;
    private String dependencia;

    public Empleado(String cargo, int sueldo, String dependencia, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.cargo = cargo;
        this.sueldo = sueldo;
        this.dependencia = dependencia;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    
    
}
