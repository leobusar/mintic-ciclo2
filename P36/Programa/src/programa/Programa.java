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
    
    private Persona[] miembros;
    private String nombre;
    private String facultad;
    private int n;
    
    public Programa(String nombre, String facultad){
        this.nombre = nombre;
        this.facultad = facultad;
        this.miembros = new Persona[100];
        this.n = 0;
    }
    
    public void mostrarMenu(){
        System.out.println("1. Agregar Estudiante");
        System.out.println("2. Agregar Profesor");
        System.out.println("3. Listar miembros del programa");
        System.out.println("4. Salir");
    }
    
    public void addPersona(Estudiante estudiante){
        this.miembros[n] = estudiante;
        n++;
    }
    
    public void addPersona(Profesor profesor){
        this.miembros[n] = profesor;
        n++;
    }
        
    public void listarMiembros(){
        System.out.println("Programa académico: "+nombre);
        System.out.println("Facultad:"+facultad);
        for(int i=0; i < n; i++){
            //System.out.println(this.miembros[i]);
            System.out.println("nombre: "+this.miembros[i].getNombre());
        }
      
    }
    
    public void ejecutarApp(){
        int opc, edad, experiencia, semestre;
        String nombre, genero, direccion, gradoAcademico;
        
        Scanner sc = new Scanner(System.in);
        do {
            mostrarMenu();
            opc = Integer.parseInt(sc.nextLine());
            switch(opc){
                case 1: 
                    System.out.println("Ingrese el nombre:");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese la edad");
                    edad = Integer.parseInt(sc.nextLine());
                    System.out.println("Ingrese genero");
                    genero = sc.nextLine();
                    System.out.println("Ingrese la direccion");
                    direccion = sc.nextLine();
                    System.out.println("Ingrese el semestre actual");
                    semestre = Integer.parseInt(sc.nextLine());
                    Estudiante estudiante = new Estudiante(semestre, nombre, edad, genero, direccion);
                    this.addPersona(estudiante);
                    break;
                case 2:
                    System.out.println("Ingrese el nombre:");
                    nombre = sc.nextLine();
                    System.out.println("Ingrese la edad");
                    edad = Integer.parseInt(sc.nextLine());
                    System.out.println("Ingrese genero");
                    genero = sc.nextLine();
                    System.out.println("Ingrese la direccion");
                    direccion = sc.nextLine();
                    System.out.println("Ingrese los años de experiencia");
                    experiencia = Integer.parseInt(sc.nextLine());
                    System.out.println("Ingrese el máximo grado académico");
                    gradoAcademico = sc.nextLine();
                    Profesor profe = new Profesor(experiencia, gradoAcademico, nombre, edad, genero, direccion);
                    this.addPersona(profe);
                    break;
                case 3:
                    listarMiembros();
                    break;
                case 4:
                    return;
                default: 
                    System.out.println("Opción no válida");

            }
        }while(opc != 4);

    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Programa programa = new Programa("Ing. Sistemas", "Ingeniería");
        programa.ejecutarApp();
    }
    
}
