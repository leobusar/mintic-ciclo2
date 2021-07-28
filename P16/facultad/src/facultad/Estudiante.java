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
public class Estudiante extends Persona{
    private int semestre; 
    private String carrera;
    private double promedio;

    public Estudiante(int semestre, String carrera, double promedio, String nombre, String apellidos, int edad) {
        super(nombre, apellidos, edad);
        this.semestre = semestre;
        this.carrera = carrera;
        this.promedio = promedio;
    }
    
    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    
}
