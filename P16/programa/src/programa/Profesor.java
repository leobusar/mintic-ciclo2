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
public class Profesor extends Persona {
    private String gradoAcademico;
    private int experiencia;

    public Profesor(String gradoAcademico, int experiencia, String nombre, int edad, String genero, String barrio) {
        super(nombre, edad, genero, barrio);
        this.gradoAcademico = gradoAcademico;
        this.experiencia = experiencia;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
    }
    
    public void reportarNotas(){
    };

    @Override
    public String toString() {
        return "Profesor{" + super.toString() +", gradoAcademico=" + gradoAcademico + ", experiencia=" + experiencia + '}';
    }

}
