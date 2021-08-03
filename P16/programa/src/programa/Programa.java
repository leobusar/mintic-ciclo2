/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

//import java.util.ArrayList;

import java.util.Scanner;


/**
 *
 * @author leobusta
 */
public class Programa {
    //protected ArrayList<Persona> personas;
    protected String nombre; 
    protected Persona[] personas;
    protected int n ;
    
    public Programa(String nombre){
        //this.personas = new ArrayList<Persona>();
        this.nombre = nombre;
        this.personas = new Persona[100];
        this.n = 0;
    }
    
    public void agregarProfesor(Profesor profesor){
        this.personas[n] = profesor;
        this.n++;
    }

    public void agregarEstudiante(Estudiante estudiante){
        this.personas[n] = estudiante;
        n++;
        // this.personas.add(estudiante);
    }
    
    public void mostrarMenu(){
        System.out.println("1. Agregar estudiante ");
        System.out.println("2. Agregar profesor ");
        System.out.println("3. Listar miembros del programa ");
        System.out.println("4. Salir ");
        System.out.print("Ingrese una opción [1-4] ");       
    }
    
    public void listarMiembros(){
        System.out.println("Miembros de "+nombre+": ");
        for(int i=0; i<n; i++)
            System.out.println(personas[i]); // personas.get(i);
    }
        
    public void ejecutarApp(){
        int opc=0;
        Scanner sc = new Scanner(System.in);
        String nombre, genero, barrio;
        int edad, semestre;

        do {
            mostrarMenu();
            opc = sc.nextInt(); sc.nextLine();
            
            switch (opc){
                case 1:
                    System.out.println("Ingresa nombre");
                    nombre = sc.nextLine();
                    System.out.println("Ingresa edad");
                    edad = sc.nextInt(); sc.nextLine();
                    System.out.println("Ingresa genero");
                    genero = sc.nextLine();
                    System.out.println("Ingresa barrio");
                    barrio = sc.nextLine();
                    System.out.println("Ingresa semestre");
                    semestre = sc.nextInt(); sc.nextLine();
                    Estudiante est = new Estudiante(semestre,nombre,edad,genero,barrio);
                    agregarEstudiante(est);
                    break;
                case 2: 
                    System.out.println("Ingresa nombre");
                    nombre = sc.nextLine();
                    System.out.println("Ingresa edad");
                    edad = sc.nextInt(); sc.nextLine();
                    System.out.println("Ingresa genero");
                    genero = sc.nextLine();
                    System.out.println("Ingresa barrio");
                    barrio = sc.nextLine();
                    System.out.println("Ingresa máximo nivel académico alcanzado");
                    String gradoAcademico = sc.nextLine();
                    System.out.println("Ingresa años de experiencia");
                    int experiencia = sc.nextInt(); sc.nextLine();
                    Profesor profe = new Profesor(gradoAcademico, experiencia, nombre,edad,genero,barrio);
                    agregarProfesor(profe);
                    break;
                case 3:
                    listarMiembros();                    
                    break;
                case 4: 
                    System.out.println("Saliendo");
                    return;
                case 5:
                    int sem = ((Estudiante) personas[0]).getSemestre();
                    System.out.println("");
                    
                    break;
                default: 
                    System.out.println("Opción inválida");
            }
            
        }while(opc !=4);    
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Programa programa = new Programa("Ingeniería de Sistemas");
        programa.ejecutarApp();
        
    }
    
}
