/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad;

/**
 *
 * @author leobusta
 */
public class Estudiante extends Persona{
    private int semestre;
    private String carrera;

    public Estudiante(int semestre, String carrera, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.semestre = semestre;
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }
    
    
    
}
