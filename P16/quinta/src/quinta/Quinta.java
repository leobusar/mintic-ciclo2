/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quinta;

import quinta.Perro;
/**
 *
 * @author leobusta
 */
public class Quinta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Perro miperro = new Perro(3, "firulais", "gris");
//        Perro miperro2 = new Perro(5, "paco", "azules");
//        Perro miperro3 = new Perro(6, "max", "negro");
//        
//        //miperro.ladrar();
//        //miperro.saludar(true);
//        System.out.println(miperro2.edad);
//        miperro2.miNombreEsIgual(miperro2);
    
        Triki nuevoJuego  = new Triki();

//        nuevoJuego.imprimirJuego();
        nuevoJuego.marcarCasilla('X', 2, 2);
        //nuevoJuego.marcarCasilla('O', 2, 2);
        nuevoJuego.imprimirJuego();
        nuevoJuego.marcarCasilla('X', 1, 1);
        nuevoJuego.imprimirJuego();
        nuevoJuego.marcarCasilla('O', 0, 1);
        nuevoJuego.imprimirJuego();
        nuevoJuego.verificarGanador();
        nuevoJuego.marcarCasilla('X', 0, 0);
        nuevoJuego.imprimirJuego();
        nuevoJuego.verificarGanador();
       
    }
    
}
