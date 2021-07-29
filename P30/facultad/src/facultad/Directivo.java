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
public class Directivo extends Empleado {
    private String oficina; 
    private Profesor[] profesores;
    private Directivo jefe;

    public Directivo(String oficina, Directivo jefe, String cargo, int sueldo, String dependencia, String nombre, String apellidos, int edad) {
        super(cargo, sueldo, dependencia, nombre, apellidos, edad);
        this.oficina = oficina;
        this.jefe = jefe;
        this.profesores = new Profesor[10];
    }

    public Directivo getJefe() {
        return jefe;
    }

    public void setJefe(Directivo jefe) {
        this.jefe = jefe;
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
    
    public void addProfesor(Profesor profesor){
        this.profesores[5] = profesor;
    }
    
}
