/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa;

//import java.util.ArrayList;

import java.util.Arrays;
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
    
    public void agregar(Profesor profesor){
        this.personas[n] = profesor;
        this.n++;
    }

    public void agregar(Estudiante estudiante){
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
        String line="";
        Scanner sc = new Scanner(System.in);
        String nombre, genero, barrio;
        int edad, semestre, experiencia;
        String[] entradas;
        int opc = 0;

        do {
            //mostrarMenu();
            //opc = sc.nextInt(); sc.nextLine();
            line = sc.nextLine();
            entradas = line.split(";");
            opc = Integer.parseInt(entradas[0]);
            
            switch (opc){
                case 1:
                    //System.out.println(Arrays.toString(entradas));
                    if(entradas[1].equals("Estudiante")){
                        semestre = Integer.parseInt(entradas[6]);
                        edad = Integer.parseInt(entradas[3]);
                        Estudiante est = new Estudiante(semestre,entradas[2],edad,entradas[4],entradas[5]);
                        agregar(est);
                    }else{
                         edad = Integer.parseInt(entradas[3]);
                         experiencia = Integer.parseInt(entradas[7]);
                         Profesor profe = new Profesor(entradas[2],edad,entradas[4],entradas[5], entradas[6], experiencia);
                         agregar(profe);
                    }
//                    System.out.println("Ingresa nombre");
//                    nombre = sc.nextLine();
//                    System.out.println("Ingresa edad");
//                    edad = sc.nextInt(); sc.nextLine();
//                    System.out.println("Ingresa genero");
//                    genero = sc.nextLine();
//                    System.out.println("Ingresa barrio");
//                    barrio = sc.nextLine();
//                    System.out.println("Ingresa semestre");
//                    semestre = sc.nextInt(); sc.nextLine();
//                    Estudiante est = new Estudiante(semestre,nombre,edad,genero,barrio);
//                    agregarEstudiante(est);
                      
                    break;
                case 2: 
                    listarMiembros();
                    break;
                case 3:
                    System.out.println("Saliendo");
                    return;
                    
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
