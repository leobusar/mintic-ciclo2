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
            
            System.out.println(this.miembros[i]);

        }
      
    }
    
    public void ejecutarApp(){
        int opc, edad, experiencia, semestre;
        String nombre, genero, direccion, gradoAcademico;
        String[] cadena;
        
        Scanner sc = new Scanner(System.in);
        do {
            //mostrarMenu();
            cadena = sc.nextLine().split(";");
            opc = Integer.parseInt(cadena[0]);
            switch(opc){
                case 1:
                    //System.out.println("Linea"+Arrays.toString(cadena));
                    edad = Integer.parseInt(cadena[3]);
                    if(cadena[1].equals("Estudiante")){
                        semestre = Integer.parseInt(cadena[6]);
                        Estudiante estudiante = new Estudiante(semestre, cadena[2], edad, cadena[4], cadena[5]);
                        this.addPersona(estudiante);
                    }else{
                        experiencia = Integer.parseInt(cadena[7]);
                        Profesor profe = new Profesor(experiencia, cadena[6], cadena[2], edad, cadena[4], cadena[5]);
                        this.addPersona(profe);                        
                    }
                    break;
                case 2:
                    listarMiembros();
                    break;
                case 3:
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
