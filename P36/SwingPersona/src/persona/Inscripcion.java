/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.util.ArrayList;

/**
 *
 * @author leobusta
 */
public class Inscripcion {
    private ArrayList<Persona> personas;
    private String nombrePrograma;

    public Inscripcion( String nombrePrograma) {
        this.personas = new ArrayList<>();
        this.nombrePrograma = nombrePrograma;
    }

    public void  addPersona(Persona persona){
        personas.add(persona);
    }
 
    public void listarPersona(){
        for (Persona p:personas)
            System.out.println(p);
    }
    
    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public String getNombrePrograma() {
        return nombrePrograma;
    }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Inscripcion app = new Inscripcion("Ing. de Sistemas");
        new PersonaGui(app);
    }    
}
