/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;

/**
 *
 * @author leobusta
 */
public class MainCiclos {
    
    public static double minNum(){
        double Xo = 1;
        double Xi = Xo/2;
        
        while (Xi != 0 ){
            System.out.println(Xo);
            Xo = Xi; 
            Xi /= 2; 
        }
        
        return Xo;
    }
    
    public static double minMaquina() {
        double Xo = 1.0;
        double Xi = Xo / 2;
        do {
            Xo = Xi;
            Xi = Xo / 2.0;
        } while (Xi > 0.0);
        return Xo;
    }
    
    public static void suma() {
        int suma = 0;
        int dato = 0;
        Scanner sc = new Scanner(System.in);
        
        do {
            System.out.print("Ingrese un número entero ");
            System.out.println("a sumar o 0 para salir: ");
            dato = Integer.parseInt(sc.nextLine());
            if (dato == 0) {
                break;
            }
            suma += dato;
        } while (dato != 0);
        System.out.println("La suma es: " + suma);
    }   
    
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
//        int i = 0;
//        while (i <= 6) {
//            System.out.println(i);
//            //i = i + 1;
//            i++;
//            
//        }

//        int i = 2; // inicializa a i en 2
//        int j = 25; // inicializa a j en 25
//        while (i < j) { // mientras i sea menor a j
//            // imprime los valores de i y j
//            System.out.println(i + ", " + j);
//            i = i * 2; // i se mult´ıplica por 2 en cada paso
//            j = j + 10; // se incrementa de 10 en 10
//        }
//        System.out.println("Fin del ciclo");
//        System.out.println(i + ", " + j);

           //System.out.println("el valor mínimo es: " + minMaquina());
           suma();
    }

}
