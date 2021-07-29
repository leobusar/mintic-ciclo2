/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author leobusta
 * 
 */
public class Profesor extends Empleado {
    private String especialidad;
    private String[] asignaturas;
    private int[] grupos;

    public Profesor(String especialidad, String[] asignaturas, int[] grupos, String departamento, double salario, String cargo, String nombre, String apellidos, int edad) {
        super(departamento, salario, cargo, nombre, apellidos, edad);
        this.especialidad = especialidad;
        this.asignaturas = asignaturas;
        this.grupos = grupos;
    }

    public int[] getGrupos() {
        return grupos;
    }

    public void setGrupos(int[] grupos) {
        this.grupos = grupos;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(String[] asignaturas) {
        this.asignaturas = asignaturas;
    }
    
    
     
}
