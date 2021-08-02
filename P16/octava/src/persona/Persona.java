/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.util.Scanner;

/**
 *
 * @author leobusta
 */
public class Persona {
    protected String nombre;
    protected int edad;
    protected Direccion direccion;
    protected Persona conyuge;

    public Persona(String nombre, int edad, Direccion direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    public int[] crecer(Scanner sc ){
        this.edad++;
        int[] a ;
        
        int x = sc.nextInt();
        
        a = new int[x];
        
        for (int i=0; i<= a.length; i++){
            a[i] = sc.nextInt();
        }
        
        return a;
    }
    
    public void main (String[] args){
        int[] arreglo = crecer();
        
        int  variable = arreglo[0];
    
    }
    public void comer () {
    
    }    
}
