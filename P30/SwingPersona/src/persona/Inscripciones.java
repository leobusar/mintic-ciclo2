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
public class Inscripciones {
    private ArrayList<Persona> personas;
    private String  nombre;

    public Inscripciones(String nombre) {
        this.nombre = nombre;
        this.personas = new ArrayList();
    }

    
    public  void addPersona(Persona persona){
        personas.add(persona);
    }
    
    public void listarPersonas(){
        for(Persona p: personas)
            System.out.println(p);
    }

    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    public String getNombre() {
        return nombre;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Inscripciones app = new Inscripciones("Ing. de sistemas");
       
       new PersonaGui(app);
    }    
}
