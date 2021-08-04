/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones;

/**
 *
 * @author leobusta
 */
public class Caja <T> {
    private T obj;

    public Caja(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
    
    public String decorar() {
        String s = this.obj.toString();
        String linea = "*";
        for (int i = 0; i < s.length(); i++) {
            linea += "*";
        }
        linea += "*";
        return linea + "\n*" + s + "*\n" + linea;
    }   
//    public String decorar(int n) {
//        String s = "" + n;
//        String linea = "*";
//        for (int i = 0; i < s.length(); i++) {
//            linea += "*";
//        }
//        linea += "*";
//        return linea + "\n*" + s + "*\n" + linea;
//    }
//
//    public String decorar(double n) {
//        String s = "" + n;
//        String linea = "*";
//        for (int i = 0; i < s.length(); i++) {
//            linea += "*";
//        }
//        linea += "*";
//        return linea + "\n*" + s + "*\n" + linea;
//    }
//
//    public String decorar(String s) {
//        String linea = "*";
//        for (int i = 0; i < s.length(); i++) {
//            linea += "*";
//        }
//        linea += "*";
//        return linea + "\n*" + s + "*\n" + linea;
//    }    

}
