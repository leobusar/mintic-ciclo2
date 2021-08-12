/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author leobusta
 */
public class Programa {
    protected String nombre;
    protected String facultad;
    protected Persona[] personas;
    private int n;

    public Programa(String nombre, String facultad){
        this.nombre = nombre;
        this.facultad = facultad;
        this.personas = new Persona[100];
        this.n = 0;
    }
    
    public void mostrarMenu(){
        System.out.println("1. Agregar Profesor");
        System.out.println("2. Agregar estudiante");
        System.out.println("3. Listar miembros del programa");
        System.out.println("4. Salir");
    }
    
    public void addPerson(Profesor profesor){
        this.personas[this.n] = profesor;
        this.n++;
    }

    public void addPerson(Estudiante estudiante){
        this.personas[this.n] = estudiante;
        this.n++;
    }
    
    public void listarMiembros(){
        System.out.println("Programa academico: "+nombre);
        System.out.println("Facultad:"+ facultad);
        for (int i =0; i < n; i++){
            System.out.println(this.personas[i]);
        }
    }
    
    public void ejecutarApp(){
        int opc;
        Scanner sc = new Scanner(System.in);
        String nombre, genero, direccion, gradoAcademico;
        int edad, experiencia, semestre;
        String[] entrada; 
        
        do {
            //mostrarMenu();
            entrada = sc.nextLine().split(";");
            
            opc = Integer.parseInt(entrada[0]);
            switch(opc){
                case 1:
                    //System.out.println("entrada:"+Arrays.toString(entrada));
                    edad = Integer.parseInt(entrada[3]);
                    if (entrada[1].equals("Profesor")){
                        experiencia = Integer.parseInt(entrada[7]);
                        gradoAcademico = entrada[6];
                        Profesor profesor = new Profesor( entrada[2], edad, entrada[4], entrada[5],gradoAcademico, experiencia);
                        this.addPerson(profesor);
                    }else{
                        semestre = Integer.parseInt(entrada[6]);
                        Estudiante  estudiante = new Estudiante( entrada[2], edad, entrada[4], entrada[5],semestre);
                        this.addPerson(estudiante);
                    }
                    break;
                case 2: 
                    this.listarMiembros();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    return;
                
                default: 
                    System.out.println("Opción inválida");
            }
        }while(opc != 4);
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Programa programa1 = new Programa("Ing. Sistemas", "Ingenieria");
        
        programa1.ejecutarApp();
        
    }
    
}
