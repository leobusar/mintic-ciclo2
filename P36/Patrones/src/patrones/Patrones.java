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
//        Caja<Double> caja = new Caja<>(10.2);
//        
//        //char a =  caja.getObj().charAt(1);
//        System.out.println("suma: "+(caja.getObj()+56));
//        String s = caja.decorar();
//        System.out.println(s);
        
//            String a = "101";
//            int b = 1/0 ;
//        Pareja<Integer, String> pareja = new Pareja<>(20, "Pedro P´aramo");
//        System.out.println(pareja);
//        Integer c = pareja.clave() + 10;
//        System.out.println(c);
//        System.out.println(pareja.valor().charAt(2));
          ArrayList <Integer> test = new ArrayList<>();
          
          test.add(1); 
          test.add(2);
          test.add(4);
          test.remove((Integer)1);
          System.out.println(test);
    }
    
}
