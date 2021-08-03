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
public class Caja {
    private Object obj;

    public Caja(Object obj) {
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }
     
    public String decorar() {
        String s = this.obj.toString();
        String linea = "#";
        for (int i = 0; i < s.length(); i++) {
            linea += "#";
        }
        linea += "#";
        return linea + "\n#" + s + "#\n" + linea;
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
//    public String decorar(double x) {
//        String s = "" + x;
//        String linea = "*";
//        for (int i = 0; i < s.length(); i++) {
//            linea += "*";
//        }
//        linea += "*";
//        return linea + "\n*" + s + "*\n" + linea;
//    }
//
//    public String decorar(String cad) {
//        String s = "" + cad;
//        String linea = "*";
//        for (int i = 0; i < s.length(); i++) {
//            linea += "*";
//        }
//        linea += "*";
//        return linea + "\n*" + s + "*\n" + linea;
//    }    
}
