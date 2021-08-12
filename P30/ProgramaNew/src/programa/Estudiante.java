/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

/**
 *
 * @author leobusta
 */
public class Estudiante extends Persona{
    private int semestre;

    public Estudiante(String nombre, int edad, String genero, String direccion,int semestre) {
        super(nombre, edad, genero, direccion);
        this.semestre = semestre;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Estudiante{"  + super.toString() + ", semestre=" + semestre + '}';
    }

    
    
}
