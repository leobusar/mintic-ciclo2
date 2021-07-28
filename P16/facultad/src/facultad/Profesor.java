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
public class Profesor extends Empleado{
    private String[] asignaturas;
    private String oficina;
    
    public Profesor (String nombre,String  apellidos,int edad, int salario, String dependencia, String cargo){
        super(nombre, apellidos, edad, salario, dependencia, cargo);
    }

    public String[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(String[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }
    
}
