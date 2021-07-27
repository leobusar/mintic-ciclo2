/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import quinta.Perro;

/**
 *
 * @author leobusta
 */
public class Prueba {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Perro miPerro = new Perro(4, "Firulais", "gris");
        
        System.out.println(miPerro.edad);
        
        miPerro.saludar(true); 
    }
}
