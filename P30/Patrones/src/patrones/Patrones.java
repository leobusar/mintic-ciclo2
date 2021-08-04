/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

import java.util.ArrayList;

/**
 *
 * @author leobusta
 */
public class Patrones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // TODO code application logic here
//        Caja<Double> caja = new Caja<>(98.1);
//        
//        String result = caja.decorar();
//        double a = caja.getObj() +10;
//        System.out.println(a);

        Pareja<Integer,String> pareja = new Pareja<Integer,String>(20,"Pedro Paramo");
        System.out.println( pareja );
        Integer c = pareja.clave() + 10;
        System.out.println( c );
        System.out.println(pareja.valor().charAt(2));
    }
    
}
