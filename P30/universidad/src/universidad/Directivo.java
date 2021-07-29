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
public class Directivo extends Empleado{
    private Profesor[] profesores;
    private Directivo jefe;
    private String oficina;

    public Directivo(Directivo jefe, String oficina, String departamento, double salario, String cargo, String nombre, String apellidos, int edad) {
        super(departamento, salario, cargo, nombre, apellidos, edad);
        this.profesores = new Profesor[10];
        this.jefe = jefe;
        this.oficina = oficina;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public Profesor[] getProfesores() {
        return profesores;
    }

    public void setProfesores(Profesor[] profesores) {
        this.profesores = profesores;
    }

    public Directivo getJefe() {
        return jefe;
    }

    public void setJefe(Directivo jefe) {
        this.jefe = jefe;
    }
    
    public void  addProfesor(Profesor profesor){
        this.profesores[7] = profesor;
    }
 
    
}
