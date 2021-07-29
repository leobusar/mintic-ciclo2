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
public class Profesor extends Empleado {
    private String [] asignaturas;
    private String nivelAcademico;
    private String tipo; // H.C T.C M.T 

    public Profesor(String[] asignaturas, String nivelAcademico, String tipo, String cargo, int sueldo, String dependencia, String nombre, String apellidos, int edad) {
        super(cargo, sueldo, dependencia, nombre, apellidos, edad);
        this.asignaturas = asignaturas;
        this.nivelAcademico = nivelAcademico;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String[] getAsignaturas() {
        return asignaturas;
    }

    public void setAsignaturas(String[] asignaturas) {
        this.asignaturas = asignaturas;
    }

    public String getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(String nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }
    
    @Override
    public String toString(){
        return this.nombre+""+this.apellidos;
    }
    
}
