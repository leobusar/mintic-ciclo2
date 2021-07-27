/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quinta;


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
//        Persona person1 =  new Persona("pepito", 16, 'M', 82, 1.80);
//        
//        System.out.println("persona1: "+person1);
//        person1.edad = 21;
//        System.out.println("persona1: "+person1);
//        System.out.println("IMC: "+person1.calcularIMC());

        Triki juego = new Triki();
        
        //juego.printMatriz();
        juego.marcarCasilla('X', 0, 0);
        juego.printMatriz();
        
        System.out.println("el ganador es: "+juego.verificarGanador());

    }
    
}
