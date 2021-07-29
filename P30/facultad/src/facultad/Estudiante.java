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
public class Estudiante extends Persona {
    private int codigo;
    private int semestre;
    private String[] asignaturas;

    public Estudiante(int codigo, int semestre, String[] asignaturas, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.codigo = codigo;
        this.semestre = semestre;
        this.asignaturas = asignaturas;
    }

    public String[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(String[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    
}
