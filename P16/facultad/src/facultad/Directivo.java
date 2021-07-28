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
public class Directivo extends Empleado{
    private Profesor[] profesores;
    private Empleado jefe; 
    private String area;

    public Directivo(Empleado jefe, String area, String nombre, String apellidos, int edad, int salario, String dependencia, String cargo) {
        super(nombre, apellidos, edad, salario, dependencia, cargo);
        this.jefe = jefe;
        this.area = area;
        this.profesores = new Profesor[10];
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Profesor[] getProfesores() {
        return profesores;
    }

    public void setProfesores(Profesor[] profesores) {
        this.profesores = profesores;
    }

    public Empleado getJefe() {
        return jefe;
    }

    public void setJefe(Empleado jefe) {
        this.jefe = jefe;
    }

    public void addProfesor(Profesor profesor){
        this.profesores[1] = profesor;
    }
}
