/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import quinta.Perro;

/**
 *
 * @author leobusta
 */
public class Prueba {
    public static void main(String[] args) {
        // TODO code application logic here
        Perro miPerro = new Perro(5,"firulais", "gris");
        
        System.out.println("edad:"+miPerro.edad);
        
        miPerro.saludar(true);
    }    
}
