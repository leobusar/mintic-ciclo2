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
        
//        Caja<String> caja = new Caja<>("Cadena");
        
        //ArrayList<Caja> cajas;
        
//        char c = caja.getObj().charAt(2);
//        String s = caja.decorar();
//        System.out.println(s);
//
//        Caja<Double> caja2 = new Caja<>(20.34);
//        System.out.println(caja2.decorar());
//        double y = caja2.getObj() + 20.0;
//        System.out.println(y);
        
//        
//        caja = new Caja(1000);
//        s = caja.decorar();
//        System.out.println(s);
//        
//        caja = new Caja(10.001);
//        s = caja.decorar();
//        System.out.println(s);
        
//        try {
//            int x  = 4/0;
//            System.out.println(" valor "+x);
//            
//        } catch(ArithmeticException e){
//            System.out.println("error  ");
//            e.printStackTrace();
//        }
        Pareja<Integer, String> pareja = new Pareja<>(20, "Pedro Paramo");
        System.out.println(pareja);
        Integer c = pareja.clave() + 10;
        System.out.println(c);
        System.out.println(pareja.valor().charAt(2));

    }

}
