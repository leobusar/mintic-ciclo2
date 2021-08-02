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
public class Profesor extends Persona{
    private int experiencia;
    private String gradoAcademico;

    public Profesor(int experiencia, String gradoAcademico, String nombre, int edad, String genero, String direccion) {
        super(nombre, edad, genero, direccion);
        this.experiencia = experiencia;
        this.gradoAcademico = gradoAcademico;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return "Profesor{" + super.toString()+ "experiencia=" + experiencia + ", gradoAcademico=" + gradoAcademico + '}';
    }

    
    
}
