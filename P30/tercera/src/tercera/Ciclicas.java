/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tercera;

import java.util.Scanner;

/**
 *
 * @author leobusta
 */
public class Ciclicas {
    
    public static double minMaquina() {
        double Xo = 1.0;
        double Xi = Xo / 2.0;
        while (Xi > 0.0) {
            //System.out.println(Xi);
            Xo = Xi;
            Xi = Xo / 2.0;
        }
        return Xo;
    }

    public static double minMaquina2() {
        double Xo = 1.0;
        double Xi = Xo / 2;
        do {
            Xo = Xi;
            Xi = Xo / 2.0;
        } while (Xi > 0.0);
        
        return Xo;
    }
    
    public static void suma() {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        while (true) {
            System.out.print("Ingrese un número entero ");
            System.out.println("a sumar o 0 para salir: ");
            //int dato = Integer.parseInt(sc.nextLine());
            int dato = sc.nextInt();
            if (dato == 0) {
                break;
            }
            suma += dato;
        }
        System.out.println("La suma es: " + suma);
    }  
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        
//        int i = 0;
//        while (i <= 6) {
//            System.out.println(i);
//            i = i + 1;
//        }
//        System.out.println(minMaquina2());
          suma();
    }
}
