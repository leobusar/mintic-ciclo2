/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedin;

import java.util.ArrayList;

/**
 *
 * @author leobusta
 */
public class Persona {
    private String nombre;
    private String cargo;
    private String areaInteres;
    private ArrayList<Persona> contactos;

    public Persona(String nombre, String cargo, String areaInteres) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.areaInteres = areaInteres;
        this.contactos = new ArrayList<Persona>();
    }

    public String getAreaInteres() {
        return areaInteres;
    }

    public void setAreaInteres(String areaInteres) {
        this.areaInteres = areaInteres;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public ArrayList<Persona> getContactos() {
        return contactos;
    }

    public void setContactos(ArrayList<Persona> contactos) {
        this.contactos = contactos;
    }
    
    public void addContacto(Persona contacto){
        this.contactos.add(contacto);
    }
    public String espacios(int nivel) {
        String s = "";
        for (int i = 0; i < nivel; i++) {
            s += "--";
        }
        return s;
    }
    String toString(int nivel) {
        String s = espacios(nivel) + nombre + '\n';
        for (Persona d : contactos) {
            s += d.toString(nivel + 1) ;
        }
        
        return s;
    }

    @Override
    public String toString() {
        return this.toString(0);
    }    
    
    public static void main(String[] args){
        Persona p1 = new Persona("Juan", "gerente", "MBA");
        Persona p2 = new Persona("Carlos", "tecnico", "Ventas");
        Persona p3 = new Persona("Andres", "presidente", "Management");
        Persona p4 = new Persona("Jose", "ingeniero", "Programacion");
        
        p1.addContacto(p2);
        p1.addContacto(p3);
        p2.addContacto(p4);
        
        System.out.println("Contactos: \n"+p1);
    }
}
