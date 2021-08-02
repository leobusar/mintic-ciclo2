/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

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
        
        do {
            mostrarMenu();
            opc = Integer.parseInt(sc.nextLine());
            switch(opc){
                case 1: 
                    System.out.println("Ingrese el nombre:");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese la edad");
                    edad = Integer.parseInt(sc.nextLine());
                    System.out.println("Ingrese el genero");
                    genero = sc.nextLine();
                    System.out.println("Ingrese el direccion");
                    direccion = sc.nextLine();
                    System.out.println("Ingrese el mayor grado academico");
                    gradoAcademico = sc.nextLine();                    
                    System.out.println("Ingrese los años de experiencia");
                    experiencia = Integer.parseInt(sc.nextLine());
                    Profesor profesor = new Profesor(gradoAcademico, experiencia, nombre, edad, genero, direccion);
                    this.addPerson(profesor);
                    break;
                case 2: 
                    System.out.println("Ingrese el nombre:");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese la edad");
                    edad = Integer.parseInt(sc.nextLine());
                    System.out.println("Ingrese el genero");
                    genero = sc.nextLine();
                    System.out.println("Ingrese el direccion");
                    direccion = sc.nextLine();                 
                    System.out.println("Ingrese el semestre actual");
                    semestre = Integer.parseInt(sc.nextLine());
                    Estudiante est = new Estudiante(semestre, nombre, edad, genero, direccion);
                    this.addPerson(est);
                    break;
                case 3:
                    this.listarMiembros();
                    break;
                case 4:
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
