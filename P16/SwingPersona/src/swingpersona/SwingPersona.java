/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingpersona;

import java.util.ArrayList;

/**
 *
 * @author leobusta
 */
public class SwingPersona {
    
    private ArrayList<Persona> personas;
    private String nombrePrograma;

    public SwingPersona(String nombrePrograma) {
        this.nombrePrograma = nombrePrograma;
        this.personas = new ArrayList<>();
    }
    
    public void  addPerson(Persona persona){
        personas.add(persona);
    }    
    
    public void listarPersonas(){
        for(Persona item: personas){
            System.out.println(item);
        }
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
        SwingPersona app = new SwingPersona("Ing. Sistemas");
        new PersonaGui(app);
        
    }    
}
